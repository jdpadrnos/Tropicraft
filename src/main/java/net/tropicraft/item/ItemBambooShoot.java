package net.tropicraft.item;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemReed;
import net.minecraft.item.ItemStack;
import net.tropicraft.info.TCInfo;
import net.tropicraft.registry.TCCreativeTabRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemBambooShoot extends ItemReed {

    public ItemBambooShoot(Block block) {
        super(block);
        this.setCreativeTab(TCCreativeTabRegistry.tabDecorations);
    }
    
    /**
     * @return The unlocalized item name
     */
    @Override
    public String getUnlocalizedName() {
        return String.format("item.%s%s", TCInfo.ICON_LOCATION, getActualName(super.getUnlocalizedName()));
    }

    /**
     * @param itemStack ItemStack instance of this item
     * @return The unlocalized item name
     */
    @Override
    public String getUnlocalizedName(ItemStack itemStack) {
        return String.format("item.%s%s", TCInfo.ICON_LOCATION, getActualName(super.getUnlocalizedName()));
    }

    /**
     * Get the actual name of the block
     * @param unlocalizedName Unlocalized name of the block
     * @return Actual name of the block, without the "tile." prefix
     */
    protected String getActualName(String unlocalizedName) {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }

    /**
     * Register all icons here
     * @param iconRegister Icon registry
     */
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister) {
        itemIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
    }
}
