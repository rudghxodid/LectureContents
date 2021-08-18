<template>
    <div>
        <v-data-table
                    :headers="headerTitle"
                    :items="boards"
                    :items-per-page="10"
                    class="elevation-1"
                      @click:row="readItem" >
                    
            </v-data-table>
            


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
                { text: '목표금액', value: 'funding', width: "100px" },
                { text: '현재모금액', value: 'nowfunding', width: "100px" },
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
                                    params: { boardNo: board.boardNo}})
        }
    },
    computed: {
         ...mapState(['board'])
    }
    
    
}
</script>