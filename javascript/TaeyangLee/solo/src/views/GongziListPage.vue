<template>
    <div id="gongzi">
       <!--
        <router-link :to="{ name: 'BoardRegisterPage' }">
            게시물 작성
        </router-link>   -->
        <gongzi-list :gongzis="gongzis"/>
    </div>
</template>

<script>
import GongziList from '@/components/gongzi/GongziList.vue'
import { mapState, mapActions } from 'vuex'
export default {
    name: 'GongziListPage',
    components: {
        GongziList
    },
    computed: {
        ...mapState(['gongzis'])
    },
    mounted () {
        this.fetchGongziList()
    },
    methods: {
        ...mapActions(['fetchGongziList'])
    }
}
</script>