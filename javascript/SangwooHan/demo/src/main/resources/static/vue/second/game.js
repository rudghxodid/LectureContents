var game = new Vue ({
el: '#game',
    data: {
        randomNumber: 0 ,
        MonsterRandomHp: 0,
        monsterName: '',
        dotory: '도토리',
        message2: '나의인벤토리',
    message: '몬스터 도감',
    list: ['[고블린]','[황금고블린]','[도깨비]','[사나운들쥐]','[주인없는고양이]','[황금쥐]','[도토리다람쥐]','[독버섯]',
        '[사나운들개]','[부서진피아노]','[거대한말벌]','[바나나킹콩]','[바나나잃은킹콩]','[두둥실풍선]',
        '[폭력적인원숭이] ','[위험한곰]','[새끼곰]','[꿀벌] '],
       
        inventory: [
            {item: '도토리'},
            {item: '도토리'}
        ],

    monsters: [
        {id: 1, name3:'썬더`전설`', hp:9999},
        {id: 2, name3:'파이어`전설`', hp:9999},
       {id: 3, name3:'프리저`전설`', hp: 9999},
   ],


},
    methods:{
    addMonster: function(){
       
        var max = this.monsters.reduce(function(a,b){
            return a > b.id ? a: b.id
        },0) 
        var max2 = this.list.reduce(function(a,b){

        },0)

        this.monsters.push({
            id: max +1,
            name3: this.list[this.randomNumber =Math.floor(Math.random() * 17)+1],
            hp: this.MonsterRandomHp = Math.floor(Math.random() * 551)+100
        })
    },
    removeMonster: function (index) {
        // 찾은 인덱스 값에서 1개를 지워라
 // 즉 인덱스 값의 정보를 지워라!
 this.monsters.splice(index,1);
  },

  userAttack: function (index){

     this.monsters[index].hp -=30

  },

},

beforeUpdate() {
            console.log('VDOM의 변화를 감지합니다.')
            var i
           for(i = 0; i< this.monsters.length; i++){
            if (this.monsters[i].hp <= 0){
                    this.monsters.splice(i,1)
                    var max = this.inventory.reduce(function(a,b){
                        return a > b.id ? a: b.id
                    },0) 
                    
    
                    this.inventory.push({
                        item: '도토리',
                    })
            }
           }
        },


randomNumber: 0,
MonsterRandomHp :0
    })