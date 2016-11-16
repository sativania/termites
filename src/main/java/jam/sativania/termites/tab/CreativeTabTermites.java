package jam.sativania.termites.tab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

/**
 * Created by Q on 16.11.2016.
 */
public class CreativeTabTermites extends CreativeTabs {

    public CreativeTabTermites(int index, String label) {
        super(index, label);
    }

    @Override
    public Item getTabIconItem() {
        return Items.WHEAT_SEEDS;
    }
}
