package PrW_15;


import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import java.util.ArrayList;
import java.util.List;


@RestController
public class HttpControllerREST
{

    private final List<String> history = new ArrayList<>();


    @PostMapping("/calc")
    public ResponseEntity<?> calculate( @RequestBody OperationRequest request )
    {
        try
        {
            double result;
            String operation = request.getOperation().toLowerCase();

            switch ( operation )
            {
                case "add":
                    result = request.getA() + request.getB();
                    break;
                case "sub":
                    result = request.getA() - request.getB();
                    break;
                case "mul":
                    result = request.getA() * request.getB();
                    break;
                case "div":
                    if ( request.getB() == 0 )
                    {
                        throw new ArithmeticException( "Division by zero is not allowed" );
                    }
                    result = request.getA() / request.getB();
                    break;
                default:
                    throw new IllegalArgumentException( "Invalid operation: " + operation );
            }

            String record = String.format( "%f %s %f = %f", request.getA(), operation, request.getB(), result );
            history.add( record );
            return ResponseEntity.ok( record );

        }
        catch ( IllegalArgumentException | ArithmeticException e )
        {
            return ResponseEntity.badRequest().body( e.getMessage() );
        }
    }

    @GetMapping("/history")
    public ResponseEntity<List<String>> getHistory()
    {
        return ResponseEntity.ok( history );
    }

}