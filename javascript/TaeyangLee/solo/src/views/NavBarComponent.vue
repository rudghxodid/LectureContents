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
                    active-class="active" v-model="show">
                회원가입
            </router-link>
           
            &nbsp;&nbsp;&nbsp;
             <router-link :to="{ name: 'VuetifyMemberLoginPage' }"
                    class="nav-link"
                    active-class="active" v-model="show">
                로그인
            </router-link>
            &nbsp;&nbsp;&nbsp;
            <router-link :to="{ name: 'Home' }"
                    class="nav-link"
                    active-class="active" v-model="show2">
                로그아웃
            </router-link>
            <v-btn @click="gotoClick" color="#CEF279" height="80px" x-large fontSize="15" class="direct">바로 후원하기</v-btn>
           
            </v-toolbar-title>
</v-toolbar>
 <div>
        <v-toolbar dense white height="80px">
            <v-app-bar-nav-icon @click="nav_drawer = !nav_drawer">
            </v-app-bar-nav-icon>
            <v-toolbar-items  >
                <v-btn class="mytoolbar" text v-for="link in links" :key="link.icon" :to="link.route">
                    {{ link.text }}
                </v-btn>
                
            </v-toolbar-items>
        <input type="text" size="20" placeholder="검색할 내용을 입력해주세요." style="height:30px; margin:20px;">
        <v-btn>검색</v-btn>
        </v-toolbar>
        <v-navigation-drawer app v-model="nav_drawer" temporary>
            <v-list nav dense>
                <v-list-item-group v-model="group" active-class="deep-purple--text text--accent-4">
                    <v-list-item v-for="link in links" :key="link.name" router :to="link.route">
                        <v-list-item-action>
                            <v-icon left>{{ link.icon }}</v-icon>
                        </v-list-item-action>
                        <v-list-item-content>
                            <v-list-item-title>{{ link.text }}</v-list-item-title>
                        </v-list-item-content>
                    </v-list-item>
                </v-list-item-group>
            </v-list>
        </v-navigation-drawer>
        
       
    </div>
       
    </div>
    
</template>

<script>
import { mapState, mapActions } from 'vuex'
export default {
    name: 'NavBarComponent',
    data () {
        return {
            
            nav_drawer: false,
            isLogin: false,
            group: false,
            show: true,
            show2: false,
         
            userInfo: {
                email: '',
                password: ''
            },
            links: [
                {
                    icon: 'home', text: '소개', name: 'home', route: '/'
                },
                {
                    icon: 'credit_card', text: '후원하기', name: 'credit_card', route: '/board'
                },
                {
                    icon: 'ev_station', text: '후원안내', name: 'ev_station', route: '/materialize'
                },
                 {
                    icon: 'ev_station', text: '문의게시판', name: 'ev_station', route: '/gongzi'
                }
            ]
        }
    },
     computed: {
        ...mapState(['list'])
    },
    mounted () {
        this.fetchLogin()
    },
    methods: {
        btnRegitser() {
             this.$router.push({
                            name: 'BoardReadPage'
                            
                        })
        },
        gotoClick() {
            this.$router.push('/board')
        },
        ...mapActions(['fetchLogin'])

       
        
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
.mytoolbar {
    
    width: 200px;
    text-align: center;
    font-size: xx-large;
}

.search {
   margin-top: 20px;
    border: 1px salmon;
}



</style>