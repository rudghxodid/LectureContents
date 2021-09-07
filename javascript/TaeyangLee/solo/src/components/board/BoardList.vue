<template>
 <div>
        
        <table border="1">
            <tr v-if="!boards || (Array.isArray(boards) && boards.length === 0)">
                <td colspan="4">
                    현재 등록된 게시물이 없습니다!
                </td>
            </tr>
            
            <tr v-else v-for="(board, idx) in boards" :key="idx">
                
                
               
                <router-link :to="{ name: 'BoardReadPage',
                                    params: { boardNo: board.boardNo.toString() } }">
                <td><img :src="require(`@/assets/img/${board.img}`)" style="width:300px; height:300px;"></td>
                
                   <td>{{board.title}} <br><br> {{board.writer}} <br><br>
                   <br><br> {{board.content}} <br><br> {{board.nowfunding}} / {{board.funding}}</td>
                </router-link>
                <td>
                    <v-btn @click="goFunding">후원하기</v-btn>
                </td>
                              
            </tr>
           
        </table>
    </div>
   
    
    
     



</template>



<script>

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
        readItem() {
            
            const board = this.boards
            
            this.$router.push({ name: 'BoardReadPage',
                                    params: { boardNo: board.boardNo.toString() }})
        },
        goFunding() {
            alert("얼마를 후원하시겠습니까?")
        }
    }
}
</script>


<style scoped>

td {
    text-align: right;
}
</style>