package jam.sativania.termites.item;

import jam.sativania.termites.Termites;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;

/**
 * Created by Q on 23.11.2016.
 */
public class ItemTemplateItem extends Item{
    public ItemTemplateItem(String unlocalized_name, String registry_name) {
        this.setUnlocalizedName(unlocalized_name);
        this.setRegistryName(new ResourceLocation(Termites.MODID, registry_name));
        this.setCreativeTab(Termites.tabTermites);
    }
}
