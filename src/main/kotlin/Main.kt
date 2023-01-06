fun main(args: Array<String>) {
    println("안녕하세요. 쇼핑몰입니다. 이름을 입력해주세요.")
    val name = readLine()
    println("나이를 입력해주세요")
    var age: Int = Integer.valueOf(readLine())
    println("안녕하세요 ${age}살 ${name}님의 개인 스타일리스트가 되어 드릴게요!")
}