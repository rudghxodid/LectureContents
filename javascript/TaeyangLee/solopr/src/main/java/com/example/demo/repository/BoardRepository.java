package com.example.demo.repository;

import com.example.demo.entity.Board;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.List;


@Repository
public class BoardRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

        public void create(Board board) throws Exception {

            String query = "insert into board (title, content, writer, img, funding, nowfunding) values (?, ?, ?, ?, ?, ?)";

            jdbcTemplate.update(query, board.getTitle(), board.getContent(), board.getWriter(),board.getImg(), board.getFunding(), board.getNowfunding());
        }
    public List<Board> list() throws Exception {

        List<Board> results = jdbcTemplate.query(
                "select board_no, title, content, writer, img, funding, nowfunding, regDate from board " +
                        "where board_no > 0 order by board_no desc",

                new RowMapper<Board>() {
                    @SneakyThrows
                    @Override
                    public Board mapRow(ResultSet rs, int rowNum) throws SQLException {
                        Board board = new Board();


                        board.setBoardNo(rs.getInt("board_no"));
                        board.setTitle(rs.getString("title"));
                        board.setContent(rs.getString("content"));
                        board.setWriter(rs.getString("writer"));
                        board.setImg(rs.getString("img"));
                        board.setFunding(rs.getInt("funding"));
                        board.setNowfunding(rs.getInt("nowfunding"));
                        board.setRegDate(rs.getDate("regDate"));


                        return board;
                    }
                }
        );

        return results;
    }
    public Board read (Integer boardNo) throws Exception {
        List<Board> results = jdbcTemplate.query(
                "select board_no, title, content, writer, img, funding, nowfunding, regDate from board where board_no = ?",
                new RowMapper<Board>() {
                    @Override
                    public Board mapRow(ResultSet rs, int rowNum) throws SQLException {
                        Board board = new Board();

                        board.setBoardNo(rs.getInt("board_no"));
                        board.setTitle(rs.getString("title"));
                        board.setContent(rs.getString("content"));
                        board.setWriter(rs.getString("writer"));
                        board.setImg(rs.getString("img"));
                        board.setFunding(rs.getInt("funding"));
                        board.setNowfunding(rs.getInt("nowfunding"));
                        board.setRegDate(rs.getDate("regDate"));

                        return board;
                    }
                }, boardNo);

        return results.isEmpty() ? null : results.get(0);
    }

    public void delete(Integer boardNo) throws  Exception {
        String query = "delete from board where board_no = ?";
        jdbcTemplate.update(query, boardNo);
    }

    public void update(Board board) throws Exception {
        String query = "update board set title = ?, content = ? where board_no = ?";
        jdbcTemplate.update(query,board.getTitle(),board.getContent(),board.getBoardNo());

    }
    public void fund(Board board) throws Exception {
        String query = "update board set nowfunding = ? where board_no = ?";
        jdbcTemplate.update(query,board.getNowfunding());
    }

    public List<Board> search() throws Exception {

        List<Board> results = jdbcTemplate.query(
                "select board_no, title, content, writer, funding, nowfunding, regDate from board " +
                        "where title = %?%",

                new RowMapper<Board>() {
                    @SneakyThrows
                    @Override
                    public Board mapRow(ResultSet rs, int rowNum) throws SQLException {
                        Board board = new Board();


                        board.setBoardNo(rs.getInt("board_no"));
                        board.setTitle(rs.getString("title"));
                        board.setContent(rs.getString("content"));
                        board.setWriter(rs.getString("writer"));
                        board.setFunding(rs.getInt("funding"));
                        board.setNowfunding(rs.getInt("nowfunding"));
                        board.setRegDate(rs.getDate("regDate"));


                        return board;
                    }

                }
        );

        return results;
    }

}
