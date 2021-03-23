import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.io.IOException;

public class CensusAnalyserTest {
    public static final String INDIA_STATE_CENSUS_FILE = "C:\\Users\\DEEP\\IdeaProjects\\IndianStateCensusAnalyerProgram\\src\\main\\resources\\IndiaStateCensusData.csv";


    @Test
    public void givenStateCensusAnalyser_usingIteratorToLoadTheData_ensureNumberOfRecordMatches() throws IOException {
        CensusAnalyser censusAnalyser = new CensusAnalyser();
        int numOfRecords = censusAnalyser.loadCensusData(INDIA_STATE_CENSUS_FILE);
        System.out.println(numOfRecords + " records are present in IndiaStateCensusData.csv");
        Assertions.assertEquals(29, numOfRecords);

    }
}