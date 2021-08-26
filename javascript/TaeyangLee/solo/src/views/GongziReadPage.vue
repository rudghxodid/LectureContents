<template>
    <div align="center">
        <h2>공지사항</h2>
        <gongzi-read v-if="gongzi" :gongzi="gongzi"/>
        <p v-else>로딩중 ...... </p>
      
        <router-link :to="{ name: 'GongziModifyPage', params: { gongziNo } }">
            게시물 수정
        </router-link>
       
        <button @click="onDelete">삭제</button>
        <router-link :to="{ name: 'GongziListPage' }">
            게시물 보기
        </router-link>
      
    </div>
</template>

<script>
import GongziRead from '@/components/gongzi/GongziRead.vue'
import { mapState, mapActions } from 'vuex'
import axios from 'axios'
export default {
    name: 'GongziReadPage',
    props: {
        gongziNo: {
            type: String,
            required: true
        }
    },
    components: {
        GongziRead
    },
    computed: {
        ...mapState(['gongzi'])
    },
    created () {
        this.fetchGongzi(this.gongziNo)
                .catch(err => {
                    alert(err.response.data.message)
                    this.$router.push()
                })
    },
    methods: {
        ...mapActions(['fetchGongzi']),
        onDelete () {
            const { gongziNo } = this.gongzi
            axios.delete(`http://localhost:7777/gongzi/${gongziNo}`)
                .then(() => {
                    alert("삭제 성공!")
                    this.$router.push({name: 'GongziListPage' })
                })
                .catch(err => {
                    alert(err.response.data.message)
                })
        }
    }
}
</script>