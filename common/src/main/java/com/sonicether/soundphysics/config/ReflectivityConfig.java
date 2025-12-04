package com.sonicether.soundphysics.config;

import com.sonicether.soundphysics.config.blocksound.BlockDefinition;
import com.sonicether.soundphysics.config.blocksound.BlockSoundConfigBase;
import net.minecraft.world.level.block.SoundType;

import java.nio.file.Path;
import java.util.Map;

public class ReflectivityConfig extends BlockSoundConfigBase {

	public ReflectivityConfig(Path path) {
		super(path);
	}

	@Override
	public void addDefaults(Map<BlockDefinition, Float> map) {

		for (SoundType type : SoundTypes.getTranslationMap().keySet()) {
			putSoundType(map, type, 0.0F);
		}

		putSoundType(map, SoundType.STONE, 0.0F);
		putSoundType(map, SoundType.NETHERITE_BLOCK, 0.0F);
		putSoundType(map, SoundType.TUFF, 0.0F);
		putSoundType(map, SoundType.AMETHYST, 0.0F);
		putSoundType(map, SoundType.BASALT, 0.0F);
		putSoundType(map, SoundType.CALCITE, 0.0F);
		putSoundType(map, SoundType.BONE_BLOCK, 0.0F);
		putSoundType(map, SoundType.COPPER, 0.0F);
		putSoundType(map, SoundType.DEEPSLATE, 0.0F);
		putSoundType(map, SoundType.DEEPSLATE_BRICKS, 0.0F);
		putSoundType(map, SoundType.DEEPSLATE_TILES, 0.0F);
		putSoundType(map, SoundType.POLISHED_DEEPSLATE, 0.0F);
		putSoundType(map, SoundType.NETHER_BRICKS, 0.0F);
		putSoundType(map, SoundType.NETHERRACK, 0.0F);
		putSoundType(map, SoundType.NETHER_GOLD_ORE, 0.0F);
		putSoundType(map, SoundType.NETHER_ORE, 0.0F);
		putSoundType(map, SoundType.STEM, 0.0F);
		putSoundType(map, SoundType.WOOL, 0.0F);
		putSoundType(map, SoundType.HONEY_BLOCK, 0.0F);
		putSoundType(map, SoundType.MOSS, 0.0F);
		putSoundType(map, SoundType.SOUL_SAND, 0.0F);
		putSoundType(map, SoundType.SOUL_SOIL, 0.0F);
		putSoundType(map, SoundType.CORAL_BLOCK, 0.0F);
		putSoundType(map, SoundType.METAL, 0.0F);
		putSoundType(map, SoundType.WOOD, 0.0F);
		putSoundType(map, SoundType.GRAVEL, 0.0F);
		putSoundType(map, SoundType.GRASS, 0.0F);
		putSoundType(map, SoundType.GLASS, 0.0F);
		putSoundType(map, SoundType.SAND, 0.0F);
		putSoundType(map, SoundType.SNOW, 0.0F);
	}

	@Override
	public Float getDefaultValue() {
		return 0.0F;
	}
}
