package catwalks.block;

import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

public interface IDecoratable {

	/**
	 * @return true if decoration changed
	 */
	public boolean putDecoration(World world, BlockPos pos, String name, boolean value);
	
}
