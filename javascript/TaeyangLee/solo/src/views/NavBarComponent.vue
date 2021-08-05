<template>

    <div>
        <v-toolbar dense white height="100px">
            
             <router-link :to="{ name: 'Home' }"
                    class="nav-link"
                    active-class="active">
                <v-img :src="require('../assets/img/happy2.png')"
                         width="200px"
                         height="80"
                         />  
            </router-link>
         
            
            <v-spacer></v-spacer>
            <v-toolbar-title>
           
            <router-link :to="{ name: 'MemberRegisterPage' }"
                    class="nav-link"
                    active-class="active">
                회원가입
            </router-link>
           
            &nbsp;&nbsp;&nbsp;
             <router-link :to="{ name: 'MemberRegisterPage' }"
                    class="nav-link"
                    active-class="active">
                로그인
            </router-link>
           
            </v-toolbar-title>
</v-toolbar>
       
    </div>
</template>

<script>
export default {
    name: 'NavBarComponent',
    data () {
        return {
            
            nav_drawer: false,

         
            userInfo: {
                email: '',
                password: ''
            },
            links: [
                {
                    icon: 'home', text: 'Home', name: 'home', route: '/'
                },
                {
                    icon: 'credit_card', text: '법인카드', name: 'credit_card', route: '/product'
                },
                {
                    icon: 'ev_station', text: 'EV Station', name: 'ev_station', route: '/materialize'
                }
            ]
        }
    },
    methods: {
        btnRegitser() {
             this.$router.push({
                            name: 'BoardReadPage'
                            
                        })
        }
    },
    watch: {
        group () {
            this.nav_drawer = false
        }
    }
}
</script>

<style scoped>
h1 {
    margin: 10px;
}
p {
    padding: 10px;
    margin: 5px 10px;
}
.first {
    width: 200px;
    margin-left: 10px;
    margin-right: 10px;
    font-size: 20px;
    background-color: white;
}



</style>