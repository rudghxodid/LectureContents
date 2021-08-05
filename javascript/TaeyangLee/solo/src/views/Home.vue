<template>




 <div id="board">
    <hooper :autoPlay="true" :playSpeed="2000" class="text-center" id="hooper">
      <slide v-for="slide in slides" :key="slide.id" class="slide">
            <p>{{ slide.id }}</p> 
      </slide>
      <hooper-navigation slot="hooper-addons"></hooper-navigation>
    </hooper>
    
  <!--   <v-list-item-group active-class="text--accent-4">
                    <v-list-item v-for="link in links" :key="link.name" router :to="link.route">
                        <v-list-item-action>
                            <v-icon left>{{ link.icon }}</v-icon>
                        </v-list-item-action>
                        <v-list-item-content>
                            <v-list-item-title>{{ link.text }}</v-list-item-title>
                        </v-list-item-content>
                    </v-list-item>
                </v-list-item-group>  -->
    <v-card width="100%" class="v-tabs">
      <v-toolbar flat green>
       
      
      <template v-slot:extension>
          <v-tabs v-model="tab" >
            <v-tab v-for="item in items" :key="item.icon">
             <v-icon center x-large>{{item.icon}}</v-icon>
             <v-text bottom>{{item.name}}</v-text>
            </v-tab>
          </v-tabs>
        </template>
      </v-toolbar>
      <v-tabs-items v-model="tab">
        <v-tab-item v-for="item in items" :key="item.name">
          <v-card>
            {{item.name}}
          </v-card>
        </v-tab-item>
      </v-tabs-items>
    </v-card> -->

        <board-list :boards="boards"/>    
    </div>
    

</template>

<script>
import BoardList from '@/components/board/BoardList.vue'
import { mapState, mapActions } from 'vuex'


import { Hooper, Slide,Navigation as HooperNavigation } from "hooper"
import 'hooper/dist/hooper.css'
export default {
    name: 'home',
    data() {
      return {
    slides: [
          {id:1},
          {id:2},
          {id:3},
          {id:4},
          {id:5},
          {id:6},
      ],
      tab: null,
   /*   links: [
                {
                    icon: 'home', text: 'Home', name: 'home', route: '/'
                },
                {
                    icon: 'credit_card', text: '법인카드', name: 'credit_card', route: '/product'
                  },
                  {
                      icon: 'ev_station', text: 'EV Station', name: 'ev_station', route: '/materialize'
                  }
              ],*/
    items: [
      { icon: 'home', name: '아동' },
      { icon: 'credit_card', name: '노인' },
      { icon: 'ev_station', name: '장애인' },
    ]
        
      }
    },
    components: {
        BoardList,
        Hooper,
        Slide,
        HooperNavigation
        
    },
    computed: {
        ...mapState(['boards'])
    },
    mounted () {
        this.fetchBoardList()
    },
    methods: {
        ...mapActions(['fetchBoardList'])
    }
}
</script>

<style scoped>
.head {
  position: fixed;
}
* {
  list-style: none;
}
#hooper {
    height: 40vh;
}
.slide {
  background: linear-gradient(-45deg, #ee7752, #e73c7e, #23a6d5, #23d5ab);
  font-size: 4rem;
  line-height: 40vh;
}
.board {
    width: 80%;
}

.v-tabs {
  width: 180px;
  height: 80px;
}

</style>