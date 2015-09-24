import java.util.ArrayList;
import java.util.List;

public class PascalTriangle
{
	public List<List<Integer>> generate(int numRows)
    {
        ArrayList<List<Integer>> pascalRows = new ArrayList<List<Integer>>();
        
        ArrayList<Integer> rowAbove = null;
        
        for (int i = 0;i< numRows;i++)
        {
            ArrayList<Integer> row = new ArrayList<Integer>();
            row.add(1);
            
            if (rowAbove != null)
            {
                for (int j = 1;j<rowAbove.size();j++)
                {
                    row.add(rowAbove.get(j-1) + rowAbove.get(j));
                }
                row.add(1);
            }
            
            rowAbove = row;
            pascalRows.add(row);
        }
        return pascalRows;
    }
}
