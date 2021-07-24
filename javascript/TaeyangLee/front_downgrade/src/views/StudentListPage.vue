<template>
    <div id="board">
        <h2>학생 성적 페이지</h2>
        <student-list :students="students"/>
        <student-score-list></student-score-list>
    </div>
</template>

<script>
import StudentList from '@/components/student/StudentList.vue'
import StudentScoreList from '@/components/student/StudentScoreList.vue'
import { mapState, mapActions } from 'vuex'
export default {
    name: 'StudentListPage',
    components: {
        StudentList,
        StudentScoreList
    },
    computed: {
        ...mapState(['students'])
    },
    mounted () {
        this.fetchStudentList()
    },
    methods: {
        ...mapActions(['fetchStudentList'])
    }
}
</script>