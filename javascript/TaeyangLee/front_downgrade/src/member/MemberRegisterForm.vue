<template>
    <form @submit.prevent="onMemberSubmit">
    <h3>회원가입폼</h3>
 <table>
    <tr>
      <td>아이디</td>
      <td><input type="text" v-model="id"></td>
    </tr>
    <tr>
      <td>비밀번호</td>
      <td><input type="password" v-model="pw"></td>
    </tr>
  </table>
    <div>
        <button type="submit">가입</button>
        <router-link :to="{ name: 'MemberListPage'}">
            취소
        </router-link>
    </div>
    </form>
    
</template>

<script>
export default {
    name: 'MemberRegisterForm',
    data() {
        return {
            id: '원하시는 아이디를 입력해주세요',
            pw : ''
           
        }
    },
    methods: {
        onSubmit() {
            const { id, pw } =this
            this.$emit('submit', { id, pw })
        }
    }
}
</script>