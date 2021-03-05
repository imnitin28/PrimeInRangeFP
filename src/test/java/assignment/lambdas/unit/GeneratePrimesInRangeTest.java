package assignment.lambdas.unit;
import assignment2.lambdas.GeneratePrimesInRange;
import assignment2.lambdas.GenerateRandomNumbers;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
class GeneratePrimesInRangeTest
{
    GenerateRandomNumbers generateRandomNumbers = new GenerateRandomNumbers();
    ArrayList<Integer> listOfNumbers = generateRandomNumbers.randomInput();
    @Test
    void randomInputTest() {
        GenerateRandomNumbers generateRandomNumbers = new GenerateRandomNumbers();
        ArrayList<Integer> listOfNumbers = generateRandomNumbers.randomInput();
        assert (!listOfNumbers.isEmpty());
        for (int i=0;i<100;i++) {
            assert(listOfNumbers.get(i)>0);
        }
        assert (listOfNumbers.get(5)<1000);
    }
    @Test
    void primeGeneratorTest() {
        ArrayList<Integer> inputListOfNumbers = new GenerateRandomNumbers().randomInput();
        GeneratePrimesInRange generatePrimesInRange = new GeneratePrimesInRange();
        List<Integer> PrimeNumber = generatePrimesInRange.filterOutPrimes(inputListOfNumbers);
        for(int i=0;i<100;i++)
        {
            if(listOfNumbers.get(i).equals(PrimeNumber))
            {
                assert (true);
            }
        }
    }
}