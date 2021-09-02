<template>
    <div>
        <h3>게시물 목록</h3>
        <table border="1">
            <tr v-if="!boards || (Array.isArray(boards) && boards.length === 0)">
                <td colspan="4">
                    현재 등록된 게시물이 없습니다!
                </td>
            </tr>
            <tr v-else v-for="board in boards" :key="board.boardNo">
                <td align="center">{{board.title}}</td>
                <td>{{board.img}}</td>

                <td>
                 <img :src="require(`@/assets/img/${board.img}`)">
                </td>                
            </tr>
        </table>
    </div>
</template>


<script>

import { mapState, mapActions } from 'vuex'

export default {
    
    name: 'BoardList',
    data() {
        return {
             headerTitle: [
                { text: '번호', value: 'boardNo', width: "70px" },
                { text: '제목', value: 'title', width: "200px" },
                { text: '작성자', value: 'writer', width: "100px" },
                { text: '내용', value: 'content', width: "100px" },
                { text: '목표금액', value: 'funding', width: "50px" },
                { text: '현재모금액', value: 'nowfunding', width: "50px" },
                { text: '', value: 'img', width: "50px"}
            ],
            
            
        }
    },
    props: {
        boards: {
            type: Array
        
        }
    },
 
 
    methods: {
        ...mapActions(['fetchBoard']),
        readItem() {
            
            const board = this.boards
            
            this.$router.push({ name: 'BoardReadPage',
                                    params: { boardNo: board.boardNo.toString() }})
        }
    },
    computed: {
         ...mapState(['board'])
    }
    
    
}
</script>