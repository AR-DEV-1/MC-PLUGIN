// Import the necessary classes
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

// Extend the JavaPlugin class
public class InfiniteDiamonds extends JavaPlugin {

    // Override the onEnable() method
    @Override
    public void onEnable() {
        // Get all online players
        for (Player player : Bukkit.getOnlinePlayers()) {
            // Create a new ItemStack of diamonds with the maximum amount
            ItemStack diamonds = new ItemStack(Material.DIAMOND, Integer.MAX_VALUE);
            // Add the diamonds to the player's inventory
            player.getInventory().addItem(diamonds);
        }
    }
}
