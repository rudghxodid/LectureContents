import {
    // 게시판
    FETCH_BOARD_LIST,
    FETCH_BOARD,
    FETCH_LOGIN
    

} from './mutation-types'

import axios from 'axios'



export default {
 
    // 게시판
    fetchBoardList ({ commit }) {
        return axios.get('http://localhost:7777/board/lists')
                .then((res) => {
                    commit(FETCH_BOARD_LIST, res.data)
                })
    },
    fetchBoard ({ commit }, boardNo) {
        return axios.get(`http://localhost:7777/board/${boardNo}`)
                .then((res) => {
                    commit(FETCH_BOARD, res.data)
                })
    },
    
    fetchLOGIN ({ commit }) {
        return axios.get('http://localhost:7777/jpamember/needSession')
                .then((res) => {
                    commit(FETCH_LOGIN, res.data)
                })
    },
   
    
    
}