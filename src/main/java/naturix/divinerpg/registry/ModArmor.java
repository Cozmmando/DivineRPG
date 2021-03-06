package naturix.divinerpg.registry;

import java.util.ArrayList;
import java.util.List;

import naturix.divinerpg.DivineRPG;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class ModArmor {
public static List<Item> DivineItemList = new ArrayList<>(30);
private Item item;
	
	public ModArmor(String name)
	{
		registerItem(name, item);
		
	}

	public static void registerItem(String name, Item item)
	{
		item.setRegistryName(name);
		item.setCreativeTab(DivineRPG.ArmorTab);
		item.setUnlocalizedName(name);

		//ForgeRegistries.ITEMS.register(item);
		
		DivineItemList.add(item);
	}
}
