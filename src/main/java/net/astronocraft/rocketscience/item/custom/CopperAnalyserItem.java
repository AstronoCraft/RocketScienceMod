package net.astronocraft.rocketscience.item.custom;

import net.astronocraft.rocketscience.item.ModItems;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

public class CopperAnalyserItem extends Item {
    public CopperAnalyserItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public InteractionResult useOn(UseOnContext pContext) {
        if(pContext.getLevel().isClientSide()) {

            Player player = pContext.getPlayer();
            Block blockClicked = pContext.getLevel().getBlockState(pContext.getClickedPos()).getBlock();

            if (blockClicked == Blocks.GRASS_BLOCK) {
                player.sendMessage(new TranslatableComponent("[Copper Analyser] has been set to: [Earth]"),
                        player.getUUID());
                player.setItemInHand(pContext.getHand() ,new ItemStack(ModItems.EARTH_COPPER_ANALYSER.get()));
            }
            else if (blockClicked == Blocks.SNOW_BLOCK) {
                player.sendMessage(new TranslatableComponent("[Copper Analyser] has been set to: [Sky]"),
                        player.getUUID());
                player.setItemInHand(pContext.getHand() ,new ItemStack(ModItems.SKY_COPPER_ANALYSER.get()));
            }
            else if ((blockClicked == Blocks.DEEPSLATE)) {
                player.sendMessage(new TranslatableComponent("[Copper Analyser] has been set to: [Space]"),
                        player.getUUID());
                player.setItemInHand(pContext.getHand() ,new ItemStack(ModItems.SPACE_COPPER_ANALYSER.get()));
            }
        }
        return super.useOn(pContext);
    }
}