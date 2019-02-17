package ru.fewizz.idextender.asm.transformer;

import org.objectweb.asm.tree.ClassNode;

import ru.fewizz.idextender.asm.AsmUtil;
import ru.fewizz.idextender.asm.IClassNodeTransformer;
import ru.fewizz.idextender.asm.Name;

public class VanillaWorld implements IClassNodeTransformer {

	@Override
	public void transform(ClassNode cn) {
		AsmUtil.transformIntConst(cn, Name.world_breakBlock, 12, 16);
	}

}