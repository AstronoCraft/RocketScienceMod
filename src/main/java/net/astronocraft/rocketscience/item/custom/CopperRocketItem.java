package net.astronocraft.rocketscience.item.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.context.UseOnContext;

public class CopperRocketItem extends Item {
    public CopperRocketItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public InteractionResult useOn(UseOnContext pContext) {
        if(pContext.getLevel().isClientSide) {
            BlockPos positionClicked = pContext.getClickedPos();

        }

        return super.useOn(pContext);
    }
}
