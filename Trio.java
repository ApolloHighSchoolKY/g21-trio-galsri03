//Write your answer here
//I didn't make changes after the solution was given
public class Trio implements MenuItem 
{
    Private Sandwich sandwich;
    Private Salad salad;
    Private Drink drink;

public Trio(Sandwich sand, Salad sal, Drink drink)
{
    sandwich = sand;
    salad = sal;
    drink = dr;
}

public String getName()
{
    return sandwich.getName() + "/" + salad.getName() + "/" + drink.getName() + "/" + "Trio"; 
}

public Double getPrice()
{
    MenuItem cheapest = sandwich;

    if (salad.getPrice < cheapest.getPrice())
        cheapest = salad;

    if (drink.getPrice < cheapest.getPrice())
        cheapest = drink;
}

}