
fun main() {

    val studentName: String = "علی رضایی"
    val studentId: Int = 14051234
    val age: Int = 20
    val major: String = "مهندسی کامپیوتر"
    val university: String = "دانشگاه فنی"
    val city: String = "ساری"
    val semester: Int = 3
    val gpa: Double = 17.85
    val credits: Int = 20
    val passedCredits: Int = 42

    val isEnrolled: Boolean = true
    val hasScholarship: Boolean = false
    val genderInitial: Char = 'ع'
    val heightMeters: Double = 1.78
    val weightKg: Double = 72.5
    val phoneModel: String = "Samsung"
    val laptopBrand: String = "Lenovo"
    val programmingLanguage: String = "Kotlin"
    val knowsKotlin: Boolean = true
    val knowsJava: Boolean = false

    val knowsCSharp: Boolean = true
    val favoriteSport: String = "فوتسال"
    val playsFutsal: Boolean = true
    val weeklyTrainingSessions: Int = 3
    val favoriteTeam: String = "رئال مادرید"
    val favoriteColor: String = "آبی"
    val favoriteMusicGenre: String = "پاپ"
    val booksRead: Int = 5
    val dailyStudyHours: Double = 3.5
    val attendancePercent: Double = 90.0

    val tuitionPaid: Boolean = true
    val hasDormitory: Boolean = true
    val dormRoomNumber: Int = 12
    val email: String = "ali@example.com"
    val birthYear: Int = 1385
    val examScore: Double = 18.0
    val projectScore: Double = 19.0
    val finalScore: Double = 18.5
    val isPassed: Boolean = true
    val message: String = "موفق باشی!"

    println("===== اطلاعات دانشجو =====")
    println("نام: $studentName")
    println("شماره دانشجویی: $studentId")
    println("سن: $age")
    println("رشته: $major")
    println("دانشگاه: $university")
    println("شهر: $city")
    println("ترم: $semester")
    println("معدل: $gpa")
    println("واحدهای این ترم: $credits")
    println("واحدهای گذرانده: $passedCredits")

    println("\n===== وضعیت تحصیلی =====")
    println("ثبت‌نام شده: $isEnrolled")
    println("دارای بورسیه: $hasScholarship")
    println("حرف اول نام: $genderInitial")
    println("قد: $heightMeters متر")
    println("وزن: $weightKg کیلوگرم")
    println("گوشی: $phoneModel")
    println("لپ‌تاپ: $laptopBrand")
    println("زبان برنامه‌نویسی: $programmingLanguage")
    println("آشنایی با Kotlin: $knowsKotlin")
    println("آشنایی با Java: $knowsJava")

    println("\n===== مهارت‌ها و علایق =====")
    println("آشنایی با C#: $knowsCSharp")
    println("ورزش مورد علاقه: $favoriteSport")
    println("فوتسال بازی می‌کند: $playsFutsal")
    println("جلسات تمرین هفتگی: $weeklyTrainingSessions")
    println("تیم مورد علاقه: $favoriteTeam")
    println("رنگ مورد علاقه: $favoriteColor")
    println("سبک موسیقی: $favoriteMusicGenre")
    println("تعداد کتاب‌ها: $booksRead")
    println("ساعت مطالعه روزانه: $dailyStudyHours")
    println("درصد حضور در کلاس: $attendancePercent")

    println("\n===== اطلاعات تکمیلی =====")
    println("شهریه پرداخت شده: $tuitionPaid")
    println("دارای خوابگاه: $hasDormitory")
    println("شماره اتاق: $dormRoomNumber")
    println("ایمیل: $email")
    println("سال تولد: $birthYear")
    println("نمره امتحان: $examScore")
    println("نمره پروژه: $projectScore")
    println("نمره نهایی: $finalScore")
    println("قبول شده: $isPassed")
    println(message)
}
