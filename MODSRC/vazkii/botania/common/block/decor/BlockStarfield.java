/**
 * This class was created by <Vazkii>. It's distributed as
 * part of the Botania Mod. Get the Source Code in github:
 * https://github.com/Vazkii/Botania
 * 
 * Botania is Open Source and distributed under a
 * Creative Commons Attribution-NonCommercial-ShareAlike 3.0 License
 * (http://creativecommons.org/licenses/by-nc-sa/3.0/deed.en_GB)
 * 
 * File Created @ [Aug 7, 2014, 6:36:37 PM (GMT)]
 */
package vazkii.botania.common.block.decor;

import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import vazkii.botania.client.core.helper.IconHelper;
import vazkii.botania.client.lib.LibRenderIDs;
import vazkii.botania.common.block.BlockModContainer;
import vazkii.botania.common.block.tile.TileStarfield;
import vazkii.botania.common.lib.LibBlockNames;

public class BlockStarfield extends BlockModContainer {

	IIcon[] icons;
	
	public BlockStarfield() {
		super(Material.iron);
		setHardness(5F);
		setResistance(2000F);
		setStepSound(soundTypeMetal);
		setBlockName(LibBlockNames.STARFIELD);
		
		setBlockBounds(0F, 0F, 0F, 1F, 0.25F, 1F);
	}
	
	@Override
	public void registerBlockIcons(IIconRegister par1IconRegister) {
		icons = new IIcon[3];
		for(int i = 0; i < icons.length; i++)
			icons[i] = IconHelper.forBlock(par1IconRegister, this, i);
	}

	@Override
	public IIcon getIcon(int par1, int par2) {
		return icons[Math.min(2, par1)];
	}
	
	@Override
	public boolean renderAsNormalBlock() {
		return false;
	}

	@Override
	public boolean isOpaqueCube() {
		return false;
	}

	@Override
	public TileEntity createNewTileEntity(World world, int meta) {
		return new TileStarfield();
	}

}