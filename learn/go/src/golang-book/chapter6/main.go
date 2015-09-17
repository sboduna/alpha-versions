package main
import "fmt"

func main() {
	{
		// Объявление массива
		// И доступ к его элементу
		var x [5]int
		x[4] = 100
		fmt.Println(x)
	}

	{
		// Длина массива и строки - len()
		var x[5]float64
		x[0] = 98
		x[1] = 93
		x[2] = 77
		x[3] = 82
		x[4] = 83
		var total float64 = 0
		for i:=0; i<len(x); i++ {
			total += x[i]
		}
		// Требуется приведение типа, работает как функция
		fmt.Println(total/float64(len(x)))

		total = 0
		// Демонстрация for-each цикла
		// Первым идёт итератор, в данном случае не нужен
		// _ сообщает об этом
		for _, i := range x {
			total += i
		}
		fmt.Println(total/float64(len(x)))
	}
	// Объявление массива с присваиванием
	{
		x := [5]float64{98, 93, 77, 82, 83}
		// Можно вертикально, но после каждого элемента
		// нужна запятая
		y := [4]float64{
			98,
			93,
			77,
			82,
		}
		fmt.Println(x,y)
	}
	// Вектора, здесь называются срезы (slice?)
	{
		// Объявление с нулевой длиной
		//var x[]float64
		// Создание среза, длина - 5
		// Есть трерий параметр, длина массива, на который
		// указывает срез
		x := make([]float64, 5)
		fmt.Println(x)
	}
	// Создание среза из массива
	{
		arr := [5]float64{1,2,3,4,5}
		// [начало:конец]
		// можно не указывать одно из них, тогда принимается
		// либо начало исходного массива, либо конец
		x := arr[0:5]
		y := arr[1:]
		fmt.Println(x,y)
	}
}