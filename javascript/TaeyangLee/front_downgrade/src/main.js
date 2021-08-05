import Vue from 'vue'
import App from './App.vue'
import router from './router'
import store from './store'
import vuetify from './plugins/vuetify'

import 'materialize-css/dist/css/materialize.min.css'
import 'material-design-icons/iconfont/material-icons.css'
import '@morioh/v-lightbox/dist/lightbox.css'
import lightbox from '@morioh/v-lightbox'


Vue.config.productionTip = false

Vue.use(lightbox)

new Vue({
  router,
  store,
  vuetify,
  lightbox,
  render: h => h(App)
}).$mount('#app')