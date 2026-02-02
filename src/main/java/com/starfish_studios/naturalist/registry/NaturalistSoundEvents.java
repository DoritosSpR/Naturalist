package com.starfish_studios.naturalist.registry;

import com.starfish_studios.naturalist.Naturalist;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;

import java.util.function.Supplier;

public class NaturalistSoundEvents {

    // MISC SOUNDS

    public static final Supplier<SoundEvent> TORTOISE_HIDE = NaturalistRegistries.registerSoundEvent("tortoise_hide", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "entity.tortoise.hide")));
    public static final Supplier<SoundEvent> TORTOISE_THUD = NaturalistRegistries.registerSoundEvent("tortoise_thud", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "entity.tortoise.thud")));
    public static final Supplier<SoundEvent> TORTOISE_HURT = NaturalistRegistries.registerSoundEvent("tortoise_hurt", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "entity.tortoise.hurt")));
    public static final Supplier<SoundEvent> TORTOISE_DEATH = NaturalistRegistries.registerSoundEvent("tortoise_death", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "entity.tortoise.death")));
    public static final Supplier<SoundEvent> TORTOISE_AMBIENT = NaturalistRegistries.registerSoundEvent("tortoise_ambient", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "entity.tortoise.ambient")));
    public static final Supplier<SoundEvent> TORTOISE_DIG = NaturalistRegistries.registerSoundEvent("tortoise_dig", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "entity.tortoise.dig")));


    public static final Supplier<SoundEvent> SNAKE_HISS = NaturalistRegistries.registerSoundEvent("snake_hiss", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "entity.snake.hiss")));
    public static final Supplier<SoundEvent> SNAKE_HURT = NaturalistRegistries.registerSoundEvent("snake_hurt", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "entity.snake.hurt")));
    public static final Supplier<SoundEvent> SNAKE_RATTLE = NaturalistRegistries.registerSoundEvent("snake_rattle", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "entity.snake.rattle")));
    public static final Supplier<SoundEvent> SNAKE_AMBIENT = NaturalistRegistries.registerSoundEvent("snake_ambient", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "entity.snake.ambient")));
    public static final Supplier<SoundEvent> SNAKE_DEATH = NaturalistRegistries.registerSoundEvent("snake_death", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "entity.snake.death")));
    public static final Supplier<SoundEvent> SNAKE_ATTACK = NaturalistRegistries.registerSoundEvent("snake_attack", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "entity.snake.attack")));
    public static final Supplier<SoundEvent> SNAIL_CRUSH = NaturalistRegistries.registerSoundEvent("snail_crush", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "entity.snail.crush")));
    public static final Supplier<SoundEvent> SNAIL_FORWARD = NaturalistRegistries.registerSoundEvent("snail_forward", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "entity.snail.forward")));
    public static final Supplier<SoundEvent> SNAIL_BACK = NaturalistRegistries.registerSoundEvent("snail_back", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "entity.snail.back")));
    public static final Supplier<SoundEvent> SNAIL_IDLE = NaturalistRegistries.registerSoundEvent("snail_idle", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "entity.snail.idle")));
    public static final Supplier<SoundEvent> SNAIL_HURT = NaturalistRegistries.registerSoundEvent("snail_hurt", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "entity.snail.hurt")));
    public static final Supplier<SoundEvent> SNAIL_DEATH = NaturalistRegistries.registerSoundEvent("snail_death", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "entity.snail.death")));
    public static final Supplier<SoundEvent> BUCKET_FILL_SNAIL = NaturalistRegistries.registerSoundEvent("bucket_fill_snail", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "item.bucket.fill_snail")));
    public static final Supplier<SoundEvent> BUCKET_EMPTY_SNAIL = NaturalistRegistries.registerSoundEvent("bucket_empty_snail", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "item.bucket.empty_snail")));
    public static final Supplier<SoundEvent> BIRD_HURT = NaturalistRegistries.registerSoundEvent("bird_hurt", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "entity.bird.hurt")));
    public static final Supplier<SoundEvent> BIRD_DEATH = NaturalistRegistries.registerSoundEvent("bird_death", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "entity.bird.death")));
    public static final Supplier<SoundEvent> BIRD_EAT = NaturalistRegistries.registerSoundEvent("bird_eat", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "entity.bird.eat")));
    public static final Supplier<SoundEvent> BIRD_FLY = NaturalistRegistries.registerSoundEvent("bird_fly", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "entity.bird.fly")));
    public static final Supplier<SoundEvent> BIRD_PECK = NaturalistRegistries.registerSoundEvent("bird_peck", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "entity.bird.peck")));
    public static final Supplier<SoundEvent> BIRD_STEP = NaturalistRegistries.registerSoundEvent("bird_step", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "entity.bird.step")));

    // BIRDS

    public static final Supplier<SoundEvent> BIRD_AMBIENT_BLUEJAY = NaturalistRegistries.registerSoundEvent("bird_ambient_bluejay", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "entity.bird.ambient_bluejay")));
    public static final Supplier<SoundEvent> BIRD_AMBIENT_CANARY = NaturalistRegistries.registerSoundEvent("bird_ambient_canary", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "entity.bird.ambient_canary")));
    public static final Supplier<SoundEvent> BIRD_AMBIENT_ROBIN = NaturalistRegistries.registerSoundEvent("bird_ambient_robin", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "entity.bird.ambient_robin")));
    public static final Supplier<SoundEvent> BIRD_AMBIENT_CARDINAL = NaturalistRegistries.registerSoundEvent("bird_ambient_cardinal", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "entity.bird.ambient_cardinal")));
    public static final Supplier<SoundEvent> BIRD_AMBIENT_FINCH = NaturalistRegistries.registerSoundEvent("bird_ambient_finch", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "entity.bird.ambient_finch")));
    public static final Supplier<SoundEvent> BIRD_AMBIENT_SPARROW = NaturalistRegistries.registerSoundEvent("bird_ambient_sparrow", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "entity.bird.ambient_sparrow")));

    public static final Supplier<SoundEvent> FIREFLY_HURT = NaturalistRegistries.registerSoundEvent("firefly_hurt", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "entity.firefly.hurt")));
    public static final Supplier<SoundEvent> FIREFLY_DEATH = NaturalistRegistries.registerSoundEvent("firefly_death", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "entity.firefly.death")));
    public static final Supplier<SoundEvent> FIREFLY_HIDE = NaturalistRegistries.registerSoundEvent("firefly_hide", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "entity.firefly.hide")));
    public static final Supplier<SoundEvent> FIREFLY_AMBIENT = NaturalistRegistries.registerSoundEvent("firefly_ambient", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "entity.firefly.ambient")));


    // FOREST SOUNDS

    public static final Supplier<SoundEvent> BEAR_HURT = NaturalistRegistries.registerSoundEvent("bear_hurt", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "entity.bear.hurt")));
    public static final Supplier<SoundEvent> BEAR_DEATH = NaturalistRegistries.registerSoundEvent("bear_death", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "entity.bear.death")));
    public static final Supplier<SoundEvent> BEAR_AMBIENT = NaturalistRegistries.registerSoundEvent("bear_ambient", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "entity.bear.ambient")));
    public static final Supplier<SoundEvent> BEAR_AMBIENT_BABY = NaturalistRegistries.registerSoundEvent("bear_ambient_baby", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "entity.bear.ambient_baby")));
    public static final Supplier<SoundEvent> BEAR_HURT_BABY = NaturalistRegistries.registerSoundEvent("bear_hurt_baby", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "entity.bear.hurt_baby")));
    public static final Supplier<SoundEvent> BEAR_SLEEP = NaturalistRegistries.registerSoundEvent("bear_sleep", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "entity.bear.sleep")));
    public static final Supplier<SoundEvent> BEAR_SNIFF = NaturalistRegistries.registerSoundEvent("bear_sniff", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "entity.bear.sniff")));
    public static final Supplier<SoundEvent> BEAR_SPIT = NaturalistRegistries.registerSoundEvent("bear_spit", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "entity.bear.spit")));
    public static final Supplier<SoundEvent> BEAR_EAT = NaturalistRegistries.registerSoundEvent("bear_eat", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "entity.bear.eat")));
    public static final Supplier<SoundEvent> DEER_AMBIENT = NaturalistRegistries.registerSoundEvent("deer_ambient", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "entity.deer.ambient")));
    public static final Supplier<SoundEvent> DEER_HURT = NaturalistRegistries.registerSoundEvent("deer_hurt", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "entity.deer.hurt")));
    public static final Supplier<SoundEvent> DEER_AMBIENT_BABY = NaturalistRegistries.registerSoundEvent("deer_ambient_baby", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "entity.deer.ambient_baby")));
    public static final Supplier<SoundEvent> DEER_HURT_BABY = NaturalistRegistries.registerSoundEvent("deer_hurt_baby", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "entity.deer.hurt_baby")));
    public static final Supplier<SoundEvent> DEER_DEATH = NaturalistRegistries.registerSoundEvent("deer_death", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "entity.deer.death")));
    public static final Supplier<SoundEvent> DEER_STEP = NaturalistRegistries.registerSoundEvent("deer_step", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "entity.deer.step")));
    public static final Supplier<SoundEvent> DEER_EAT = NaturalistRegistries.registerSoundEvent("deer_eat", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "entity.deer.eat")));


    // SAVANNA SOUNDS

    public static final Supplier<SoundEvent> RHINO_SCRAPE = NaturalistRegistries.registerSoundEvent("rhino_scrape", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "entity.rhino.scrape")));
    public static final Supplier<SoundEvent> RHINO_AMBIENT = NaturalistRegistries.registerSoundEvent("rhino_ambient", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "entity.rhino.ambient")));
    public static final Supplier<SoundEvent> RHINO_AMBIENT_BABY = NaturalistRegistries.registerSoundEvent("rhino_ambient_baby", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "entity.rhino.ambient_baby")));
    public static final Supplier<SoundEvent> RHINO_HURT = NaturalistRegistries.registerSoundEvent("rhino_hurt", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "entity.rhino.hurt")));
    public static final Supplier<SoundEvent> RHINO_DEATH = NaturalistRegistries.registerSoundEvent("rhino_death", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "entity.rhino.death")));
    public static final Supplier<SoundEvent> LION_HURT = NaturalistRegistries.registerSoundEvent("lion_hurt", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "entity.lion.hurt")));
    public static final Supplier<SoundEvent> LION_AMBIENT = NaturalistRegistries.registerSoundEvent("lion_ambient", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "entity.lion.ambient")));
    public static final Supplier<SoundEvent> LION_ROAR = NaturalistRegistries.registerSoundEvent("lion_roar", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "entity.lion.roar")));
    public static final Supplier<SoundEvent> LION_DEATH = NaturalistRegistries.registerSoundEvent("lion_death", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "entity.lion.death")));
    public static final Supplier<SoundEvent> ELEPHANT_HURT = NaturalistRegistries.registerSoundEvent("elephant_hurt", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "entity.elephant.hurt")));
    public static final Supplier<SoundEvent> ELEPHANT_AMBIENT = NaturalistRegistries.registerSoundEvent("elephant_ambient", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "entity.elephant.ambient")));
    public static final Supplier<SoundEvent> ELEPHANT_DEATH = NaturalistRegistries.registerSoundEvent("elephant_death", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "entity.elephant.death")));
    public static final Supplier<SoundEvent> ZEBRA_AMBIENT = NaturalistRegistries.registerSoundEvent("zebra_ambient", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "entity.zebra.ambient")));
    public static final Supplier<SoundEvent> ZEBRA_HURT = NaturalistRegistries.registerSoundEvent("zebra_hurt", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "entity.zebra.hurt")));
    public static final Supplier<SoundEvent> ZEBRA_DEATH = NaturalistRegistries.registerSoundEvent("zebra_death", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "entity.zebra.death")));
    public static final Supplier<SoundEvent> ZEBRA_EAT = NaturalistRegistries.registerSoundEvent("zebra_eat", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "entity.zebra.eat")));
    public static final Supplier<SoundEvent> ZEBRA_BREATHE = NaturalistRegistries.registerSoundEvent("zebra_breathe", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "entity.zebra.breathe")));
    public static final Supplier<SoundEvent> ZEBRA_ANGRY = NaturalistRegistries.registerSoundEvent("zebra_angry", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "entity.zebra.angry")));
    public static final Supplier<SoundEvent> ZEBRA_JUMP = NaturalistRegistries.registerSoundEvent("zebra_jump", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "entity.zebra.jump")));
    public static final Supplier<SoundEvent> VULTURE_AMBIENT = NaturalistRegistries.registerSoundEvent("vulture_ambient", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "entity.vulture.ambient")));
    public static final Supplier<SoundEvent> VULTURE_HURT = NaturalistRegistries.registerSoundEvent("vulture_hurt", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "entity.vulture.hurt")));
    public static final Supplier<SoundEvent> VULTURE_DEATH = NaturalistRegistries.registerSoundEvent("vulture_death", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "entity.vulture.death")));
    public static final Supplier<SoundEvent> GIRAFFE_AMBIENT = NaturalistRegistries.registerSoundEvent("giraffe_ambient", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "entity.giraffe.ambient")));
    public static final Supplier<SoundEvent> HIPPO_AMBIENT = NaturalistRegistries.registerSoundEvent("hippo_ambient", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "entity.hippo.ambient")));
    public static final Supplier<SoundEvent> HIPPO_HURT = NaturalistRegistries.registerSoundEvent("hippo_hurt", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "entity.hippo.hurt")));
    public static final Supplier<SoundEvent> HIPPO_DEATH = NaturalistRegistries.registerSoundEvent("hippo_death", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "entity.hippo.death")));
    public static final Supplier<SoundEvent> BOAR_AMBIENT = NaturalistRegistries.registerSoundEvent("boar_ambient", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "entity.boar.ambient")));
    public static final Supplier<SoundEvent> BOAR_HURT = NaturalistRegistries.registerSoundEvent("boar_hurt", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "entity.boar.hurt")));
    public static final Supplier<SoundEvent> BOAR_DEATH = NaturalistRegistries.registerSoundEvent("boar_death", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "entity.boar.death")));
    public static final Supplier<SoundEvent> BOAR_ATTACK = NaturalistRegistries.registerSoundEvent("boar_attack", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "entity.boar.attack")));
    public static final Supplier<SoundEvent> MOOSE_AMBIENT = NaturalistRegistries.registerSoundEvent("moose_ambient", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "entity.moose.ambient")));
    public static final Supplier<SoundEvent> MOOSE_HURT = NaturalistRegistries.registerSoundEvent("moose_hurt", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "entity.moose.hurt")));
    public static final Supplier<SoundEvent> MOOSE_DEATH = NaturalistRegistries.registerSoundEvent("moose_death", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "entity.moose.death")));
    public static final Supplier<SoundEvent> MOOSE_ATTACK = NaturalistRegistries.registerSoundEvent("moose_attack", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "entity.moose.attack")));
    public static final Supplier<SoundEvent> MOOSE_BELLOW = NaturalistRegistries.registerSoundEvent("moose_bellow", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "entity.moose.bellow")));
    public static final Supplier<SoundEvent> MOOSE_AMBIENT_BABY = NaturalistRegistries.registerSoundEvent("moose_ambient_baby", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "entity.moose.ambient_baby")));
    public static final Supplier<SoundEvent> MOOSE_HURT_BABY = NaturalistRegistries.registerSoundEvent("moose_hurt_baby", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "entity.moose.hurt_baby")));
    public static final Supplier<SoundEvent> MOOSE_DEATH_BABY = NaturalistRegistries.registerSoundEvent("moose_death_baby", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "entity.moose.death_baby")));
    public static final Supplier<SoundEvent> LIZARD_AMBIENT = NaturalistRegistries.registerSoundEvent("lizard_ambient", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "entity.lizard.ambient")));
    public static final Supplier<SoundEvent> LIZARD_SLEEP = NaturalistRegistries.registerSoundEvent("lizard_sleep", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "entity.lizard.sleep")));
    public static final Supplier<SoundEvent> LIZARD_HURT = NaturalistRegistries.registerSoundEvent("lizard_hurt", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "entity.lizard.hurt")));
    public static final Supplier<SoundEvent> LIZARD_DEATH = NaturalistRegistries.registerSoundEvent("lizard_death", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "entity.lizard.death")));
    public static final Supplier<SoundEvent> CATERPILLAR_HURT = NaturalistRegistries.registerSoundEvent("caterpillar_hurt", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "entity.caterpillar.hurt")));
    public static final Supplier<SoundEvent> CATERPILLAR_DEATH = NaturalistRegistries.registerSoundEvent("caterpillar_death", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "entity.caterpillar.death")));
    public static final Supplier<SoundEvent> VULTURE_WING = NaturalistRegistries.registerSoundEvent("vulture_wing", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "entity.vulture.wing")));
    public static final Supplier<SoundEvent> GIRAFFE_HURT = NaturalistRegistries.registerSoundEvent("giraffe_hurt", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "entity.giraffe.hurt")));
    public static final Supplier<SoundEvent> GIRAFFE_DEATH = NaturalistRegistries.registerSoundEvent("giraffe_death", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "entity.giraffe.death")));
    public static final Supplier<SoundEvent> GIRAFFE_EAT = NaturalistRegistries.registerSoundEvent("giraffe_eat", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "entity.giraffe.eat")));
    public static final Supplier<SoundEvent> GIRAFFE_MAD = NaturalistRegistries.registerSoundEvent("giraffe_mad", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "entity.giraffe.mad")));
    public static final Supplier<SoundEvent> GIRAFFE_STEP = NaturalistRegistries.registerSoundEvent("giraffe_step", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "entity.giraffe.step")));


    // SWAMP SOUNDS

    // Gator Eggs
    public static final Supplier<SoundEvent> GATOR_EGG_BREAK = NaturalistRegistries.registerSoundEvent("alligator_egg_break", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "entity.alligator.egg_break")));
    public static final Supplier<SoundEvent> GATOR_EGG_CRACK = NaturalistRegistries.registerSoundEvent("alligator_egg_crack", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "entity.alligator.egg_crack")));
    public static final Supplier<SoundEvent> GATOR_EGG_HATCH = NaturalistRegistries.registerSoundEvent("alligator_egg_hatch", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "entity.alligator.egg_hatch")));

    // Tortoise Eggs
    public static final Supplier<SoundEvent> TORTOISE_EGG_BREAK = NaturalistRegistries.registerSoundEvent("tortoise_egg_break", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "entity.tortoise.egg_break")));
    public static final Supplier<SoundEvent> TORTOISE_EGG_CRACK = NaturalistRegistries.registerSoundEvent("tortoise_egg_crack", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "entity.tortoise.egg_crack")));
    public static final Supplier<SoundEvent> TORTOISE_EGG_HATCH = NaturalistRegistries.registerSoundEvent("tortoise_egg_hatch", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "entity.tortoise.egg_hatch")));

    public static final Supplier<SoundEvent> GATOR_AMBIENT = NaturalistRegistries.registerSoundEvent("alligator_ambient", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "entity.alligator.ambient")));
    public static final Supplier<SoundEvent> GATOR_AMBIENT_BABY = NaturalistRegistries.registerSoundEvent("alligator_ambient_baby", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "entity.alligator.ambient_baby")));
    public static final Supplier<SoundEvent> GATOR_HURT = NaturalistRegistries.registerSoundEvent("alligator_hurt", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "entity.alligator.hurt")));
    public static final Supplier<SoundEvent> GATOR_DEATH = NaturalistRegistries.registerSoundEvent("alligator_death", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "entity.alligator.death")));
    public static final Supplier<SoundEvent> GATOR_BITE = NaturalistRegistries.registerSoundEvent("alligator_bite", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "entity.alligator.bite")));
    public static final Supplier<SoundEvent> GATOR_SWIM = NaturalistRegistries.registerSoundEvent("alligator_swim", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "entity.alligator.swim")));
    public static final Supplier<SoundEvent> CATFISH_FLOP = NaturalistRegistries.registerSoundEvent("catfish_flop", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "entity.catfish.flop")));
    public static final Supplier<SoundEvent> BASS_FLOP = NaturalistRegistries.registerSoundEvent("bass_flop", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "entity.bass.flop")));
    public static final Supplier<SoundEvent> DRAGONFLY_LOOP = NaturalistRegistries.registerSoundEvent("dragonfly_loop", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "entity.dragonfly.loop")));
    public static final Supplier<SoundEvent> DRAGONFLY_FLY = NaturalistRegistries.registerSoundEvent("dragonfly_fly", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "entity.dragonfly.fly")));
    public static final Supplier<SoundEvent> DRAGONFLY_HURT = NaturalistRegistries.registerSoundEvent("dragonfly_hurt", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "entity.dragonfly.hurt")));
    public static final Supplier<SoundEvent> DRAGONFLY_DEATH = NaturalistRegistries.registerSoundEvent("dragonfly_death", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "entity.dragonfly.death")));
    // DUCK SOUNDS
    public static final Supplier<SoundEvent> DUCK_AMBIENT = NaturalistRegistries.registerSoundEvent("duck_ambient", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "entity.duck.ambient")));
    public static final Supplier<SoundEvent> DUCK_HURT = NaturalistRegistries.registerSoundEvent("duck_hurt", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "entity.duck.hurt")));
    public static final Supplier<SoundEvent> DUCK_DEATH = NaturalistRegistries.registerSoundEvent("duck_death", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "entity.duck.death")));
    public static final Supplier<SoundEvent> DUCK_STEP = NaturalistRegistries.registerSoundEvent("duck_step", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "entity.duck.step")));
    // RUBBER DUCKY SOUNDS
    public static final Supplier<SoundEvent> RUBBER_DUCKY_AMBIENT = NaturalistRegistries.registerSoundEvent("rubber_ducky_ambient", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "entity.rubber_ducky.ambient")));
    public static final Supplier<SoundEvent> RUBBER_DUCKY_HURT = NaturalistRegistries.registerSoundEvent("rubber_ducky_hurt", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "entity.rubber_ducky.hurt")));
    public static final Supplier<SoundEvent> RUBBER_DUCKY_DEATH = NaturalistRegistries.registerSoundEvent("rubber_ducky_death", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "entity.rubber_ducky.death")));


    public static void init() {
    }
}
