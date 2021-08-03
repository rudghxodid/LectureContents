<template>
    <coverflow :coverList="coverList" :coverWidth="260" :index="2"></coverflow>
</template>

<script>
import coverflow from 'vue-coverflow'
export default {
    name: 'CoverflowTestPage',
    data () {
        return {
            coverList: [
                {
                    // cover: 'https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FcVaw4d%2FbtqDURwZDoX%2Fq6XGmMMrktN33iW1v3gtMk%2Fimg.png',
                    cover: require('@/assets/img/spyder.jpg'),
                    title: 'Spyder 918'
                }, {
                    cover: 'https://mblogthumb-phinf.pstatic.net/20160904_85/yuminhouse_1472958465066iz9H4_JPEG/%C5%DA%B7%B9%C5%E4%BA%F1_1.JPG?type=w800',
                    title: 'Angular'
                }, {
                    cover: 'https://media.vlpt.us/post-images/katanazero86/aba9c930-4af7-11ea-b431-d56bc1d096a4/vuejs-tutorial2d2a853c-aa2f-44b0-80df-933b495f77f8.png',
                    title: 'Vue'
                }, {
                    cover: 'https://d2.naver.com/content/images/2020/12/1228.png',
                    title: 'Webpack'
                }, {
                    cover: 'https://flutter-kr.io/images/flutter-logo-sharing.png',
                    title: 'Yarn'
                }, {
                    cover: 'https://miro.medium.com/max/768/1*8nyFLuZUdtMqWyu7H8glOg.png',
                    title: 'Node'
                }
            ]
        }
    },
    components: {
        coverflow
    }
}
</script>