package com.sonicether.soundphysics.config;

import com.sonicether.soundphysics.SoundPhysicsMod;

public class ReverbParams {
	public float decayTime;
	public float density;
	public float diffusion;
	public float gain;
	public float gainHF;
	public float decayHFRatio;
	public float reflectionsGain;
	public float reflectionsDelay;
	public float lateReverbGain;
	public float lateReverbDelay;
	public float airAbsorptionGainHF;
	public float roomRolloffFactor;

	public static ReverbParams getReverb0() {
		ReverbParams r = new ReverbParams();
		r.decayTime = 0.1F;
		r.density = 0F;
		r.diffusion = 0F;
		r.gain = 0F;
		r.gainHF = 1F;
		r.decayHFRatio = 1F;
		r.reflectionsGain = 0F;
		r.reflectionsDelay = 0F;
		r.lateReverbGain = 0F;
		r.lateReverbDelay = 0F;
		r.airAbsorptionGainHF = 1F;
		r.roomRolloffFactor = 0F;
		return r;
	}

	public static ReverbParams getReverb1() {
		return getReverb0();
	}

	public static ReverbParams getReverb2() {
		return getReverb0();
	}

	public static ReverbParams getReverb3() {
		return getReverb0();
	}

	private static float globalReverbMultiplier() {
		return 0.0F;
	}
}
