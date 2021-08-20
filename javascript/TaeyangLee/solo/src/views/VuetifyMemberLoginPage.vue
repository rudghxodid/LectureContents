<template>
    <div>
        <div align="center">
            <h2>로그인</h2>
        </div>
        <vuetify-member-login-form @submit="onSubmit"/>
        <v-spacer></v-spacer>
       
    </div>
</template>

<script>
import VuetifyMemberLoginForm from '@/components/member/VuetifyMemberLoginForm.vue'
import axios from 'axios'

export default {
    name: 'VuetifyMemberLoginPage',
    components: {
        VuetifyMemberLoginForm
    },
    
    
    methods: {
        onSubmit (payload) {
            const { id, pw } = payload
            axios.post('http://localhost:7777/jpamember/login', { userId: id, password: pw, auth: null })
                    .then(res => {
                        if (res.data != "") {
                            alert('환영합니다!')
                            this.isLogin = true;
                            this.$router.push({name: 'Home'})
                        } else {
                            alert('로그인 실패! - ' + res.data)
                        }
                        
                        
                        
                    })
                    .catch(res => {
                        alert(res.response.data.message)
                    })
        },
        showSession () {
            if (this.isLogin == true) {
                axios.post('http://localhost:7777/jpamember/needSession')
                        .then(res => {
                            if (res.data == true) {
                                alert('세션 정보 유지! - ' + res.data)
                            } else {
                                alert('세션 정보 유지 안되는 중! - ' + res.data)
                            }
                            /*
                            this.$router.push({
                                name: 'BoardReadPage',
                                params: { boardNo: res.data.boardNo.toString() }
                            })
                            */
                        })
                        .catch(res => {
                            alert(res.response.data.message)
                        })
            } else {
                alert('먼저 로그인부터 하세요!')
            }
        },
        removeSession () {
            axios.post('http://localhost:7777/jpamember/removeSession')
                    .then(res => {
                        this.isLogin = res.data
                    })
        }
    }
}
</script>