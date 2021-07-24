<template>
    <div>
        <h3>학생목록</h3>
        <table border="1">
            <tr>
                <th align="center" width="50">학번</th>
                <th align="center" width="200">학생명</th>
                <th align="center" width="50">나이</th>
                <th align="center" width="50">성별</th>
                <th align="center" width="50">점수</th>
            </tr>
            <tr v-if="!students || (Array.isArray(students) && students.length === 0)">
                <td colspan="4">
                    채점이 안됬습니다
                </td>
            </tr>
            <tr v-else v-for="(student, idx) in students" :key="idx">
                <td align="center">{{ student.studentNo }}</td>
                <td align="center" v-on:click="measureScoreAvg(student.score, $event)">
                    {{ student.name }}
                </td>
                <td align="center">{{ student.age }}</td>
                <td align="center">{{ student.sex }}</td>
                <td align="center">{{ student.score }}</td>
            </tr>
        </table>
    </div>
</template>

<script>
import EventBus from '@/eventBus.js'
export default {
    name: 'StudentList',
    props: {
        students: {
            type: Array
        }
    },
    methods: {
        studentScoreAvg(score, $event) {
            const payload = [ score, $event.target.innerHTML ]
            EventBus.$emit('studentScoreAvg', payload)
        }
    }
}
</script>