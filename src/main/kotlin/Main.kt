fun main(args: Array<String>) {
    println("안녕하세요. 쇼핑몰입니다. 이름을 입력해주세요.")
    val name = readLine()
    println("나이를 입력해주세요")
    var age: Int = Integer.valueOf(readLine())
    println("안녕하세요 ${age}살 ${name}님의 개인 스타일리스트가 되어 드릴게요!")
    print("*************************************************************\n")

    val categories = arrayOf("패션", "전자기기","반려동물용품")
    for (category in categories){
        println(category)
    }
    println("장바구니로 이동하려면 # 입력")

    var selectedcatrgory = readLine()
    while (selectedcatrgory.isNullOrBlank()){
        println("값을 입력해주세요.")
        selectedcatrgory = readLine()
    }
    if (selectedcatrgory == "#"){
        // TODO 1. 장바구니 이동
    }else{
        // TODO 2. 카테고리 상품 목록 보여주기
        // TODO 3. 카테고리 목록에 없는 값을 입력하는 경우1
    }
}
