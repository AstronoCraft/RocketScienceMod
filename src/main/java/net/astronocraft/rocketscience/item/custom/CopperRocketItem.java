package net.astronocraft.rocketscience.item.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.animal.Pig;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.LevelAccessor;

public class CopperRocketItem extends Item {
    public CopperRocketItem(Properties pProperties) {
        super(pProperties);
    }

    public InteractionResult useOn(UseOnContext pContext, LevelAccessor world) {
        if(pContext.getLevel().isClientSide) {
            BlockPos positionClicked = pContext.getClickedPos();
            Entity entityToSpawn = new Pig(EntityType.PIG, pContext.getLevel());
            entityToSpawn.moveTo(positionClicked.getX(), positionClicked.getX(), positionClicked.getZ());
            world.addFreshEntity(entityToSpawn);
        }
        return super.useOn(pContext);
    }
}
