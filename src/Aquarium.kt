import kotlin.math.pow

fun operators(){
    //val -> constantes (VALue)
    //var -> variaveis  (VARiable)
    println(1+1)
    println(53-3)
    println(50/10)
    println(1/2)
    println(1.0/2.0)
    println(6*50)
    var fish=2
    fish=fish.times(2)
    println(fish)
    fish=fish.plus(4)
    println(fish)
    fish=fish.minus(2)
    println(fish)
    fish=fish.div(2)
    println(fish)

    //boxing
    fish.toLong()
    fish.toDouble()
    fish.toFloat()
    fish.toShort()
    fish.toByte()
    fish.toString()
}

fun nullability(){
    //var marbles : Int = null
    // ERRO, o kotlin nao permite associar o valor null a uma variavel, a nao ser que se deixe explicito
    var marbles :Int? = null
    // Assim ja e possivel, pois a variavel "acha" que vai a assumir um int

    //var list1:List<String> = listOf(null,null)
    //ERRO, como o tipo e especifico a String e como o kotlin considera "null" o seu proprio tipo, nao e possivel
    // associar null a list por  conta do tipo de dados restrito
    var list1:List<String?> = listOf(null,null)
    //Desta forma ja e possivel, pois o kotlin nao definiu, estritamente, String como o tipo de dados
}
//fun funname(parameterName:parameterType): returnType{}
fun nullpointer(): Int {
   var fish : Int? = 2
    //verificaçao de null:
    print(fish!!)
    //os  dois pontos de exclamaçao, ou Double Bang, fazem a verificaçao da nullabilidade da variavel
    //Assim sendo, e possivel verificar se um objeto e null antes de executar alguma funçao, da seguinte maneira:
    fish=fish!!.times(2)
    //Se o fish nao for null ira multiplicar, se for ira "levantar" uma nullPointerException
    // i.e., o que aqui esta explicito e o seguinte (python syntax)
        //if fish is not null then:
            //fish=fish*2
        //else:
            //raise kotlin.KotliNullPointException
    //A seguinte expressao verifica o seguinte:
    //no ponto de interrogacao inicial, e verificada a nulabilidade da variavel
    //se nao for null, ira correr a funçao aplicada
    //se for, ira assumir o valor indicada no apos o "Elvis Operator" ?:
    //para este caso de return, Se fish for not null, ira retornar fish*4
    //Caso seja null, ira retornar 0
    //Outro exemplo: fishInAquarium = fish?.minus(2) ?:2
    //A variavel fishInAquarium ira receber um valor, sendo que, se fish nao for null, ira receber fish-2
    //caso seja null, ira receber o valor 2, pois e o valor associado ao Elvis
    return fish?.plus(4) ?: 0
}

fun strings(){
    var fish : Int = 5
    var plants : Int = 10
    println("I have $fish fish in the aquarium")
    println("I have ${fish+plants} fish and plants in the aquarium")
}

fun comparation(){
    var fish : Int =5
    var plants : Int =10

    if (plants>fish) println("Good Ratio")
    else
        println("Bad Ratio")
    if (fish in 1..10) println("Good amount")
    else println("Bad amount")

    when(fish){
        0->println("Empty tank")
        in 1..5 -> print("low Tank")
        10->println("full Tank")
        else-> print("perfect")
    }
}

fun arrays(){
    val myList = mutableListOf("Tuna","Salmon","Shark")
    //myList= mutableListOf("koi","goldfish")
    //erro, pois e val e nao se pode mudar a referencia da "myList", que e o que esta a ser feito
    myList.remove("Shark")
    //Assim ja e possivel, pois nao estamos a mudar a referencia da variavel, mas sim o objeto para qua a variavel
    // referencia

    var fish=12
    var plants = 50
    val swarm= listOf(fish,plants)

    val school = arrayOf("tuna","salmon","shark")
    val numbers = intArrayOf(1,2,3)
    //val erro = intArrayOf(1,"foo") erro pois so aceita o tipo especifico, no caso int
    val mixedArray = arrayOf(1,"foo")
    val arrayOfArray = arrayOf(numbers,mixedArray)
    val arr=Array(5){it*2}
    //ou seja, um array de 5 posiçoes, sendo que o conteudo sera o index*2 "{it*2}"

    //foreach
    for (element in mixedArray) print(element)

    //foreach para elemento e index,  semelhante a dict
    for ((index,element)  in mixedArray.withIndex()){
        print("Pos = $index value = $element ")
    }

    //for range
    for (i in 'a'..'g') print(i)
    for (i in 1..5) print(i)
    for (i in 5 downTo 1) print(i)
    for (i in 1..10 step 2) print(1)

}
fun main(){
    operators()
}