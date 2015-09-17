package main

import "fmt"

func main() {
	// Упрощённый цикл, только одно условие
	// while здесь не бывает
	{
		i := 1
		for i <= 10 {
			fmt.Println(i)
			i = i + 1
		}
	}

	// C-подобный
	{
		for i:= 1; i <= 10; i++ {
			fmt.Println(i)
		}
	}

	// Здесь if, почему-то без скобок
	// Скобки юзать в условиях таки можно, но не обязательно
	{
		for i:=1; i <= 10; i++ {
			if i % 2 == 0 {
				fmt.Println(i, "even")
			} else {
				fmt.Println(i, "odd")
			}
		}
	}
	// Это switch-case. У него нет brake
	{
		for i:=1; i <= 10; i++ {
			switch i {
				case 0: fmt.Println("Zero")
				case 1: fmt.Println("One")
				case 2: fmt.Println("Two")
				case 3: fmt.Println("Three")
				case 4: fmt.Println("Four")
				case 5: fmt.Println("Five")
				default: fmt.Println("Len")
			}
		}
	}
}
