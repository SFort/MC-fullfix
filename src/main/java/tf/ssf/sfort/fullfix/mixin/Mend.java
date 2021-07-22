package tf.ssf.sfort.fullfix.mixin;

import net.minecraft.screen.AnvilScreenHandler;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Mixin(value = AnvilScreenHandler.class, priority = 369)
public abstract class Mend  {
	@ModifyArg(method = "updateResult()V", at=@At(value = "INVOKE", target = "Lnet/minecraft/item/ItemStack;setDamage(I)V"))
	public int staphhammertiem(int i) {
		return 0;
	}
}
