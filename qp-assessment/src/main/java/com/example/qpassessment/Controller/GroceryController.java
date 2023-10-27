import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class GroceryController {
    private final GroceryItemRepository repository;

    public GroceryController(GroceryItemRepository repository) {
        this.repository = repository;
    }



    @PostMapping("/admin/groceries")
    public String addGroceryItem(@RequestBody GroceryItem item) {

    }

    @GetMapping("/admin/groceries")
    public Iterable<GroceryItem> viewGroceryItems() {

    }

    @DeleteMapping("/admin/groceries/{id}")
    public String removeGroceryItem(@PathVariable Long id) {

    }

    @PutMapping("/admin/groceries/{id}")
    public String updateGroceryItem(@PathVariable Long id, @RequestBody GroceryItem updatedItem) {

    }

    @PatchMapping("/admin/groceries/{id}/inventory")
    public String manageInventory(@PathVariable Long id, @RequestBody int change) {

    }



    @GetMapping("/user/groceries")
    public List<GroceryItem> viewAvailableGroceryItems() {

    }
}