/*
 * Copyright (c) 2021, jmakhack <https://github.com/jmakhack>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package com.hydratereminder;

import lombok.AllArgsConstructor;
import lombok.Getter;

import static net.runelite.api.ItemID.*;

/**
 * <p>Different background images that can be swapped between for
 * the hydrate reminder overlay timer display
 * </p>
 * @author jmakhack
 */
@Getter
@AllArgsConstructor
public enum HydrateReminderTimerImages
{
    // WATER
    CUP_OF_WATER_IMAGE("Cup of Water", CUP_OF_WATER),
    CUP_OF_HOT_WATER_IMAGE("Cup of Hot Water", CUP_OF_HOT_WATER),
    VIAL_OF_WATER_IMAGE("Vial of Water", VIAL_OF_WATER),
    BOWL_OF_WATER_IMAGE("Bowl of Water", BOWL_OF_WATER),
    BUCKET_OF_WATER_IMAGE("Bucket of Water", BUCKET_OF_WATER),
    JUG_OF_WATER_IMAGE("Jug of Water", JUG_OF_WATER),
    FULL_JUG_IMAGE("Full Jug", FULL_JUG),
    BOWL_OF_HOT_WATER_IMAGE("Bowl of Hot Water", BOWL_OF_HOT_WATER),
    BOTTLED_WATER_IMAGE("Bottled Water", BOTTLED_WATER),
    WATERFILLED_GOURD_VIAL_IMAGE("Water-filled Gourd Vial", WATERFILLED_GOURD_VIAL),
    HOLY_WATER_IMAGE("Holy Water", HOLY_WATER),
    BOWL_OF_RED_WATER_IMAGE("Bowl of Red Water", BOWL_OF_RED_WATER),
    BOWL_OF_BLUE_WATER_IMAGE("Bowl of Blue Water", BOWL_OF_BLUE_WATER),
    GOLDEN_BOWL_IMAGE("Golden Bowl", GOLDEN_BOWL_724),
    NETTLEWATER_IMAGE("Nettle-water", NETTLEWATER),
    BLESSED_WATER_IMAGE("Blessed Water", BLESSED_WATER),
    FULL_BUCKET_IMAGE("Full Bucket", FULL_BUCKET),
    VASE_OF_WATER_IMAGE("Vase of Water", VASE_OF_WATER),
    WATERSKIN_IMAGE("Waterskin", WATERSKIN4),
    MURKY_WATER_IMAGE("Murky Water", MURKY_WATER),
    WATER_CONTAINER_IMAGE("Water Container", WATER_CONTAINER),
    WATER_ORB_IMAGE("Water Orb", WATER_ORB),
    TOME_OF_WATER_IMAGE("Tome of Water", TOME_OF_WATER),
    WATER_RUNE_IMAGE("Water Rune", WATER_RUNE),
    WATER_TALISMAN_IMAGE("Water Talisman", WATER_TALISMAN),
    WATER_TIARA_IMAGE("Water Tiara", WATER_TIARA),
    POND_IMAGE("Pond", POND),
    SMALL_FOUNTAIN_IMAGE("Small Fountain", SMALL_FOUNTAIN),
    LARGE_FOUNTAIN_IMAGE("Large Fountain", LARGE_FOUNTAIN),
    POSH_FOUNTAIN_IMAGE("Posh Fountain", POSH_FOUNTAIN),
    SINK_IMAGE("Sink", SINK),
    GOLD_SINK_IMAGE("Gold Sink", GOLD_SINK),
    WAKING_SLEEP_VIAL_IMAGE("Waking Sleep Vial", WAKING_SLEEP_VIAL),
    VIAL_OF_TEARS_IMAGE("Vial of Tears", VIAL_OF_TEARS_FULL),
    VIAL_OF_SORROW_IMAGE("Vial of Sorrow", VIAL_OF_SORROW),
    WATERFILLED_VIAL_IMAGE("Water-filled Vial", WATERFILLED_VIAL),
    BUCKET_OF_WATER_COOKOUT_IMAGE("Bucket of Water (Cookout)", BUCKET_OF_WATER_COOKOUT),
    PORTAL_TALISMAN_WATER_IMAGE("Portal Talisman (Water)", PORTAL_TALISMAN_WATER),
    CIRCLET_OF_WATER_IMAGE("Circlet of Water", CIRCLET_OF_WATER),

    // TEA
    CUP_OF_TEA_IMAGE("Cup of Tea", CUP_OF_TEA),
    TEA_FLASK_IMAGE("Tea Flask", TEA_FLASK),
    NETTLE_TEA_IMAGE("Nettle Tea", NETTLE_TEA),
    CUP_OF_NETTLE_TEA_IMAGE("Cup of Nettle Tea", CUP_OF_TEA_4242),
    RUINED_HERB_TEA_IMAGE("Ruined Herb Tea", RUINED_HERB_TEA),
    HERB_TEA_MIX_IMAGE("Herb Tea Mix", HERB_TEA_MIX),
    TEAPOT_IMAGE("Clay Teapot", TEAPOT),
    WHITE_PORCELAIN_TEAPOT_IMAGE("Porcelain Teapot", TEAPOT_7714),
    GOLDTRIMMED_PORCELAIN_TEAPOT("Gold-trimmed Teapot", TEAPOT_7726),
    TEA_LEAVES_IMAGE("Tea Leaves", TEA_LEAVES),
    CUP_OF_GREEN_TEA_IMAGE("Cup of Green Tea", CUP_OF_TEA_4242),
    CUP_OF_WHITE_TEA_IMAGE("Cup of White Tea", CUP_OF_TEA_4243),
    PORCELAIN_CUP_OF_GREEN_TEA_IMAGE("Porcelain Cup of Green Tea", CUP_OF_TEA_4245),
    PORCELAIN_CUP_OF_WHITE_TEA_IMAGE("Porcelain Cup of White Tea", CUP_OF_TEA_4246),
    GUTHIX_REST_IMAGE("Guthix Rest", GUTHIX_REST4),
    POT_OF_TEA_IMAGE("Pot of Tea", POT_OF_TEA_4),
    GOLD_TEAPOT_IMAGE("Golden Teapot", POT_OF_TEA_4_7716),
    CLAY_CUP_OF_TEA_IMAGE("Clay Cup of Tea", CUP_OF_TEA_7730),
    PORCELAIN_CUP_OF_TEA_IMAGE("Porcelain Cup of Tea", CUP_OF_TEA_7733),
    GOLDTRIMMED_CUP_OF_TEA_IMAGE("Gold-trimmed Cup of Tea", CUP_OF_TEA_7736),
    STRONG_CUP_OF_TEA_IMAGE("Strong Cup of Tea", STRONG_CUP_OF_TEA),

    // ALCOHOL
    KHALI_BREW_IMAGE("Khali Brew", KHALI_BREW),
    ASGARNIAN_ALE_IMAGE("Asgarnian Ale", ASGARNIAN_ALE),
    WIZARDS_MIND_BOMB_IMAGE("Wizards Mind Bomb", WIZARDS_MIND_BOMB),
    GREENMANS_ALE_IMAGE("Greenmans Ale", GREENMANS_ALE),
    DRAGON_BITTER_IMAGE("Dragon Bitter", DRAGON_BITTER),
    DWARVEN_STOUT_IMAGE("Dwarven Stout", DWARVEN_STOUT),
    GROG_IMAGE("Grog", GROG),
    BEER_IMAGE("Beer", BEER),
    JUG_OF_WINE_IMAGE("Jug of Wine", JUG_OF_WINE),
    VODKA_IMAGE("Vodka", VODKA),
    WHISKY_IMAGE("Whisky", WHISKY),
    GIN_IMAGE("Gin", GIN),
    BRANDY_IMAGE("Brandy", BRANDY),
    COCKTAIL_SHAKER_IMAGE("Cocktail Shaker", COCKTAIL_SHAKER),
    UNFINISHED_COCKTAIL_IMAGE("Unfinished Cocktail", UNFINISHED_COCKTAIL),
    PINEAPPLE_PUNCH_IMAGE("Pineapple Punch", PINEAPPLE_PUNCH),
    WIZARD_BLIZZARD_IMAGE("Wizard Blizzard", WIZARD_BLIZZARD),
    BLURBERRY_SPECIAL_IMAGE("Blurberry Special", BLURBERRY_SPECIAL),
    CHOC_SATURDAY_IMAGE("Choc Saturday", CHOC_SATURDAY),
    SHORT_GREEN_GUY_IMAGE("Short Green Guy", SHORT_GREEN_GUY),
    FRUIT_BLAST_IMAGE("Fruit Blast", FRUIT_BLAST),
    DRUNK_DRAGON_IMAGE("Drunk Dragon", DRUNK_DRAGON),
    ODD_COCKTAIL_IMAGE("Odd Cocktail", ODD_COCKTAIL),
    MOONLIGHT_MEAD_IMAGE("Moonlight Mead", MOONLIGHT_MEAD),
    KEG_OF_BEER_IMAGE("Keg of Beer", KEG_OF_BEER),
    BEER_TANKARD_IMAGE("Beer Tankard", BEER_TANKARD),
    CHEFS_DELIGHT_IMAGE("Chef's Delight", CHEFS_DELIGHT),
    SLAYERS_RESPITE_IMAGE("Slayer's Respite", SLAYERS_RESPITE),
    KELDA_STOUT_IMAGE("Kelda Stout", KELDA_STOUT),
    AHABS_BEER_IMAGE("Ahab's Beer", AHABS_BEER),
    BRAINDEATH_RUM_IMAGE("Braindeath 'Rum'", BRAINDEATH_RUM),
    DIRTY_BLAST_IMAGE("Dirty Blast", DIRTY_BLAST),
    ASGOLDIAN_ALE_IMAGE("Asgoldian Ale", ASGOLDIAN_ALE),
    CIDER_IMAGE("Cider", CIDER_7752),
    BOTTLE_OF_WINE_IMAGE("Bottle of Wine", BOTTLE_OF_WINE),
    BEER_BARREL_IMAGE("Beer Barrel", BEER_BARREL),
    RUM_IMAGE("Rum", RUM),
    ZAMORAKS_UNFERMENTED_WINE_IMAGE("Zamorak's Unfermented Wine", ZAMORAKS_UNFERMENTED_WINE),
    WINE_OF_ZAMORAK_IMAGE("Wine of Zamorak", WINE_OF_ZAMORAK_23489),
    BLOOD_PINT_IMAGE("Blood Pint", BLOOD_PINT),
    KOVACS_GROG_IMAGE("Kovac's Grog", KOVACS_GROG),
    FESTIVE_WHITE_WINE_IMAGE("Festive White Wine", FESTIVE_WHITE_WINE),
    FESTIVE_MULLED_WINE_IMAGE("Festive Mulled Wine", FESTIVE_MULLED_WINE),
    HAUNTED_WINE_BOTTLE_IMAGE("Haunted Wine Bottle", HAUNTED_WINE_BOTTLE),

    // DRINK
    BUCKET_OF_MILK_IMAGE("Bucket of Milk", BUCKET_OF_MILK),
    CHOCOLATEY_MILK_IMAGE("Chocolatey Milk", CHOCOLATEY_MILK),
    COCONUT_MILK_IMAGE("Coconut Milk", COCONUT_MILK),
    REDBERRY_JUICE_IMAGE("Redberry Juice", REDBERRY_JUICE),
    MILKY_MIXTURE_IMAGE("Milky Mixture", MILKY_MIXTURE),
    SPRING_SQIRKJUICE_IMAGE("Spring Sq'irkjuice", SPRING_SQIRKJUICE),
    SUMMER_SQIRKJUICE_IMAGE("Summer Sq'irkjuice", SUMMER_SQIRKJUICE),
    AUTUMN_SQIRKJUICE_IMAGE("Autumn Sq'irkjuice", AUTUMN_SQIRKJUICE),
    WINTER_SQIRKJUICE_IMAGE("Winter Sq'irkjuice", WINTER_SQIRKJUICE),
    ENDARKENED_JUICE_IMAGE("Endarkened Juice", ENDARKENED_JUICE),
    BIG_BUCKET_OF_CAMEL_MILK_IMAGE("Big Bucket of Camel Milk", BIG_BUCKET_OF_CAMEL_MILK),
    BIG_BUCKET_OF_FROZEN_CAMEL_MILK_IMAGE("Big Bucket of Frozen Camel Milk", BIG_BUCKET_OF_FROZEN_CAMEL_MILK),
    BOTTLE_OF_TONIC_IMAGE("Bottle of 'Tonic'", BOTTLE_OF_TONIC),

    // DRINK CONTAINERS
    KETTLE_IMAGE("Kettle", KETTLE),
    FULL_KETTLE_IMAGE("Full Kettle", FULL_KETTLE),
    HOT_KETTLE_IMAGE("Hot Kettle", HOT_KETTLE),
    SILVER_CUP_IMAGE("Silver Cup", SILVER_CUP),
    SILVER_BOTTLE_IMAGE("Silver Bottle", SILVER_BOTTLE),
    TANKARD_IMAGE("Tankard", TANKARD),
    KEG_IMAGE("Keg", KEG),
    JEREDS_EMPTY_WINE_BOTTLE_IMAGE("Jered's Empty Wine Bottle", JEREDS_EMPTY_WINE_BOTTLE),
    ICE_COOLER_IMAGE("Ice Cooler", ICE_COOLER),
    COOLER_IMAGE("Cooler", COOLER),

    // FOOD
    LIQUID_HONEY_IMAGE("Liquid Honey", LIQUID_HONEY),
    COOKING_POT_IMAGE("Cooking Pot", COOKING_POT),
    INCOMPLETE_STEW_IMAGE("Incomplete Stew", INCOMPLETE_STEW),
    UNCOOKED_STEW_IMAGE("Uncooked Stew", UNCOOKED_STEW),
    STEW_IMAGE("Stew", STEW),
    BURNT_STEW_IMAGE("Burnt Stew", BURNT_STEW),
    UNCOOKED_CURRY_IMAGE("Uncooked Curry", UNCOOKED_CURRY),
    CURRY_IMAGE("Curry", CURRY),
    BURNT_CURRY_IMAGE("Burnt Curry", BURNT_CURRY),
    POT_OF_CREAM_IMAGE("Pot of Cream", POT_OF_CREAM),
    OLIVE_OIL_IMAGE("Olive Oil", OLIVE_OIL4),
    BANANA_STEW_IMAGE("Banana Stew", BANANA_STEW),
    RED_HOT_SAUCE_IMAGE("Red Hot Sauce", RED_HOT_SAUCE),
    WATERMELON_SLICE_IMAGE("Watermelon Slice", WATERMELON_SLICE),
    SPICY_SAUCE_IMAGE("Spicy Sauce", SPICY_SAUCE),
    BRULEE_IMAGE("Brulee", BRULEE),
    SPICY_STEW_IMAGE("Spicy Stew", SPICY_STEW),
    JUG_OF_VINEGAR_IMAGE("Jug of Vinegar", JUG_OF_VINEGAR),
    POT_OF_VINEGAR_IMAGE("Pot of Vinegar", POT_OF_VINEGAR),
    ANCHOVY_PASTE_IMAGE("Anchovy Paste", ANCHOVY_PASTE),
    SERVERY_STEW_IMAGE("Servery Stew", SERVERY_STEW),
    FESTIVE_POT_IMAGE("Festive Pot", FESTIVE_POT),
    GOBLIN_STEW_IMAGE("Goblin Stew", GOBLIN_STEW),
    SPECIAL_HOT_SAUCE_IMAGE("Special Hot Sauce", SPECIAL_HOT_SAUCE),

    // POTION
    POTION_IMAGE("Potion", POTION),
    GUAM_POTION_IMAGE("Guam Potion", GUAM_POTION_UNF),
    MARRENTILL_POTION_IMAGE("Marrentill Potion", MARRENTILL_POTION_UNF),
    TARROMIN_POTION_IMAGE("Tarromin Potion", TARROMIN_POTION_UNF),
    HARRALANDER_POTION_IMAGE("Harralander Potion", HARRALANDER_POTION_UNF),
    RANARR_POTION_IMAGE("Ranarr Potion", RANARR_POTION_UNF),
    IRIT_POTION_IMAGE("Irit Potion", IRIT_POTION_UNF),
    AVANTOE_POTION_IMAGE("Avantoe Potion", AVANTOE_POTION_UNF),
    KWUARM_POTION_IMAGE("Kwuarm Potion", KWUARM_POTION_UNF),
    CADANTINE_POTION_IMAGE("Cadantine Potion", CADANTINE_POTION_UNF),
    DWARF_WEED_POTION_IMAGE("Dwarf Weed Potion", DWARF_WEED_POTION_UNF),
    TORSTOL_POTION_IMAGE("Torstol Potion", TORSTOL_POTION_UNF),
    STRENGTH_POTION_IMAGE("Strength Potion", STRENGTH_POTION4),
    BRAVERY_POTION_IMAGE("Bravery Potion", BRAVERY_POTION),
    CADAVA_POTION_IMAGE("Cadava Potion", CADAVA_POTION),
    MAGIC_OGRE_POTION_IMAGE("Magic Ogre Potion", MAGIC_OGRE_POTION),
    ATTACK_POTION_IMAGE("Attack Potion", ATTACK_POTION4),
    RESTORE_POTION_IMAGE("Restore Potion", RESTORE_POTION4),
    DEFENCE_POTION_IMAGE("Defence Potion", DEFENCE_POTION4),
    PRAYER_POTION_IMAGE("Prayer Potion", PRAYER_POTION4),
    SUPER_ATTACK_POTION_IMAGE("Super Attack Potion", SUPER_ATTACK4),
    FISHING_POTION_IMAGE("Fishing Potion", FISHING_POTION4),
    SUPER_STRENGTH_POTION_IMAGE("Super Strength Potion", SUPER_STRENGTH4),
    SUPER_DEFENCE_POTION_IMAGE("Super Defence Potion", SUPER_DEFENCE4),
    RANGING_POTION_IMAGE("Ranging Potion", RANGING_POTION4),
    ANTIPOISON_IMAGE("Antipoison", ANTIPOISON4),
    SUPER_ANTIPOISON_IMAGE("Super Antipoison", SUPERANTIPOISON4),
    ZAMORAK_BREW_IMAGE("Zamorak Brew", ZAMORAK_BREW4),
    ANTIFIRE_POTION_IMAGE("Antifire Potion", ANTIFIRE_POTION4),
    LANTADYME_POTION_IMAGE("Lantadyme Potion", LANTADYME_POTION_UNF),
    TOADFLAX_POTION_IMAGE("Toadflax Potion", TOADFLAX_POTION_UNF),
    SNAPDRAGON_POTION_IMAGE("Snapdragon Potion", SNAPDRAGON_POTION_UNF),
    ENERGY_POTION_IMAGE("Energy Potion", ENERGY_POTION4),
    SUPER_ENERGY_POTION_IMAGE("Super Energy Potion", SUPER_ENERGY4),
    SUPER_RESTORE_POTION_IMAGE("Super Restore Potion", SUPER_RESTORE4),
    AGILITY_POTION_IMAGE("Agility Potion", AGILITY_POTION4),
    MAGIC_POTION_IMAGE("Magic Potion", MAGIC_POTION4),
    EXPOSIVE_POTION_IMAGE("Explosive Potion", EXPLOSIVE_POTION),
    STRANGE_POTION_IMAGE("Strange Potion", STRANGE_POTION),
    ANTIDOTE_IMAGE("Antidote", ANTIDOTE4),
    PLANT_CURE_IMAGE("Plant Cure", PLANT_CURE_6468),
    COMPOST_POTION_IMAGE("Compost Potion", COMPOST_POTION4),
    TRUTH_SERUM_IMAGE("Truth Serum", TRUTH_SERUM),
    HEALING_VIAL_IMAGE("Healing Vial", HEALING_VIAL4),
    MIXTURE_STEP_ONE_IMAGE("Mixture - Step 1", MIXTURE__STEP_14),
    SANFEW_SERUM_IMAGE("Sanfew Serum", SANFEW_SERUM4),
    DREAM_POTION_IMAGE("Dream Potion", DREAM_POTION),
    FISH_VIAL_IMAGE("Fish Vial", FISH_VIAL),
    ATTACK_MIX_IMAGE("Attack Mix", ATTACK_MIX2),
    ANTIPOISON_MIX_IMAGE("Antipoison Mix", ANTIPOISON_MIX2),
    RELICYMS_MIX_IMAGE("Relicyms Mix", RELICYMS_MIX2),
    STRENGTH_MIX_IMAGE("Strength Mix", STRENGTH_MIX2),
    COMBAT_MIX_IMAGE("Combat Mix", COMBAT_MIX2),
    RESTORE_MIX_IMAGE("Restore Mix", RESTORE_MIX2),
    ENERGY_MIX_IMAGE("Energy Mix", ENERGY_MIX2),
    DEFENCE_MIX_IMAGE("Defence Mix", DEFENCE_MIX2),
    AGILITY_MIX_IMAGE("Agility Mix", AGILITY_MIX2),
    PRAYER_MIX_IMAGE("Prayer Mix", PRAYER_MIX2),
    SUPERATTACK_MIX_IMAGE("Superattack Mix", SUPERATTACK_MIX2),
    ANTIPOISON_SUPERMIX_IMAGE("Antipoison Supermix", ANTIPOISON_SUPERMIX2),
    FISHING_MIX_IMAGE("Fishing Mix", FISHING_MIX2),
    SUPER_ENERGY_MIX_IMAGE("Super Energy Mix", SUPER_ENERGY_MIX2),
    SUPER_STRENGTH_MIX_IMAGE("Super Strength Mix", SUPER_STR_MIX2),
    MAGIC_ESSENCE_MIX_IMAGE("Magic Essence Mix", MAGIC_ESSENCE_MIX2),
    SUPER_RESTORE_MIX_IMAGE("Super Restore Mix", SUPER_RESTORE_MIX2),
    SUPER_DEFENCE_MIX_IMAGE("Super Defence Mix", SUPER_DEF_MIX2),
    ANTIDOTE_MIX_IMAGE("Antidote+ Mix", ANTIDOTE_MIX2),
    ANTIFIRE_MIX_IMAGE("Antifire Mix", ANTIFIRE_MIX2),
    RANGING_MIX_IMAGE("Ranging Mix", RANGING_MIX2),
    MAGIC_MIX_IMAGE("Magic Mix", MAGIC_MIX2),
    HUNTING_MIX_IMAGE("Hunting Mix", HUNTING_MIX2),
    ZAMORAK_MIX_IMAGE("Zamorak Mix", ZAMORAK_MIX2),
    STAMINA_POTION_IMAGE("Stamina Potion", STAMINA_POTION4),
    STAMINA_MIX_IMAGE("Stamina Mix", STAMINA_MIX2),
    SUPER_COMBAT_POTION_IMAGE("Super Combat Potion", SUPER_COMBAT_POTION4),
    VOICE_POTION_IMAGE("Voice Potion", VOICE_POTION),
    CAT_ANTIPOISON_IMAGE("Cat Antipoison", CAT_ANTIPOISON),
    ANTIVENOM_IMAGE("Anti-venom", ANTIVENOM4),
    ANTIVENOM_PLUS_IMAGE("Anti-venom+", ANTIVENOM4_12913),
    REJUVENATION_POTION_IMAGE("Rejuvenation Potion", REJUVENATION_POTION_4),
    ELDER_POTION_IMAGE("Elder Potion", ELDER_POTION_4),
    TWISTED_POTION_IMAGE("Twisted Potion", TWISTED_POTION_4),
    KODAI_POTION_IMAGE("Kodai Potion", KODAI_POTION_4),
    REVITALISATION_POTION_IMAGE("Revitalisation Potion", REVITALISATION_POTION_4),
    PRAYER_ENHANCE_IMAGE("Prayer Enhance", PRAYER_ENHANCE_4),
    XERICS_AID_IMAGE("Xeric's Aid", XERICS_AID_4),
    OVERLOAD_IMAGE("Overload", OVERLOAD_4_20988),
    POTION_OF_SEALEGS_IMAGE("Potion of Sealegs", POTION_OF_SEALEGS),
    MURKY_POTION_IMAGE("Murky Potion", MURKY_POTION),
    SPECTRAL_POTION_IMAGE("Spectral Potion", SPECTRAL_POTION),
    SUPER_ANTIFIRE_POTION_IMAGE("Super Antifire Potion", SUPER_ANTIFIRE_POTION4),
    SUPER_ANTIFIRE_MIX_IMAGE("Super Antifire Mix", SUPER_ANTIFIRE_MIX2),
    EXTENDED_SUPER_ANTIFIRE_IMAGE("Extended Super Antifire", EXTENDED_SUPER_ANTIFIRE4),
    BLOOD_POTION_IMAGE("Blood Potion", BLOOD_POTION),
    CADANTINE_BLOOD_POTION_IMAGE("Cadantine Blood Potion", CADANTINE_BLOOD_POTION_UNF),
    BATTLEMAGE_POTION_IMAGE("Battlemage Potion", BATTLEMAGE_POTION4),
    BASTION_POTION_IMAGE("Bastion Potion", BASTION_POTION4),
    SUPER_RESTORE_IMAGE("Super Restore", SUPER_RESTORE4_23567),
    SARADOMIN_BREW_IMAGE("Saradomin Brew", SARADOMIN_BREW4_23575),
    DIVINE_SUPER_COMBAT_POTION_IMAGE("Divine Super Combat Potion", DIVINE_SUPER_COMBAT_POTION4),
    DIVINE_SUPER_ATTACK_POTION_IMAGE("Divine Super Attack Potion", DIVINE_SUPER_ATTACK_POTION4),
    DIVINE_SUPER_STRENGTH_POTION_IMAGE("Divine Super Strength Potion", DIVINE_SUPER_STRENGTH_POTION4),
    DIVINE_SUPER_DEFENCE_POTION_IMAGE("Divine Super Defence Potion", DIVINE_SUPER_DEFENCE_POTION4),
    DIVINE_RANGING_POTION_IMAGE("Divine Ranging Potion", DIVINE_RANGING_POTION4),
    DIVINE_MAGIC_POTION_IMAGE("Divine Magic Potion", DIVINE_MAGIC_POTION4),
    INVERSION_POTION_IMAGE("Inversion Potion", INVERSION_POTION),
    GRYM_POTION_IMAGE("Grym Potion", GRYM_POTION_UNF),
    EGNIOL_POTION_IMAGE("Egniol Potion", EGNIOL_POTION_4),
    BLIGHTED_SUPER_RESTORE_IMAGE("Blighted Super Restore", BLIGHTED_SUPER_RESTORE4),
    DIVINE_BATTLEMAGE_POTION_IMAGE("Divine Battlemage Potion", DIVINE_BATTLEMAGE_POTION4),
    DIVINE_BASTION_POTION_IMAGE("Divine Bastion Potion", DIVINE_BASTION_POTION4),
    CASTLEWARS_BREW_IMAGE("Castlewars Brew", CASTLEWARS_BREW4),
    POTION_OF_POWER_IMAGE("Potion of Power", POTION_OF_POWER4),
    SULPHUR_POTION_IMAGE("Sulphur Potion", SULPHUR_POTION),
    SHIELDING_POTION_IMAGE("Shielding Potion", SHIELDING_POTION),
    COMBAT_POTION_IMAGE("Combat Potion", COMBAT_POTION4_26150),
    MAGICAL_CLEANING_POTION_IMAGE("Magical Cleaning Potion", MAGICAL_CLEANING_POTION),
    ANCIENT_BREW_IMAGE("Ancient Brew", ANCIENT_BREW4),
    ANCIENT_MIX_IMAGE("Ancient Mix", ANCIENT_MIX2),
    GOBLIN_POTION_IMAGE("Goblin Potion", GOBLIN_POTION4),

    // DYE
    RED_DYE_IMAGE("Red Dye", RED_DYE),
    YELLOW_DYE_IMAGE("Yellow Dye", YELLOW_DYE),
    BLUE_DYE_IMAGE("Blue Dye", BLUE_DYE),
    ORANGE_DYE_IMAGE("Orange Dye", ORANGE_DYE),
    GREEN_DYE_IMAGE("Green Dye", GREEN_DYE),
    PURPLE_DYE_IMAGE("Purple Dye", PURPLE_DYE),
    BLACK_MUSHROOM_INK_IMAGE("Black Mushroom Ink", BLACK_MUSHROOM),
    PINK_DYE_IMAGE("Pink Dye", PINK_DYE),
    ABYSSAL_GREEN_DYE_IMAGE("Abyssal Green Dye", ABYSSAL_GREEN_DYE),
    ABYSSAL_BLUE_DYE_IMAGE("Abyssal Blue Dye", ABYSSAL_BLUE_DYE),
    ABYSSAL_RED_DYE_IMAGE("Abyssal Red Dye", ABYSSAL_RED_DYE),

    // CHEMICAL
    CUPRIC_SULFATE_IMAGE("Cupric Sulfate", CUPRIC_SULFATE),
    ACETIC_ACID_IMAGE("Acetic Acid", ACETIC_ACID),
    HAGS_POISON_IMAGE("Hags Poison", HAGS_POISON),
    WEAPON_POISON_IMAGE("Weapon Poison", WEAPON_POISON_5940),
    RAT_POISON_IMAGE("Rat Poison", RAT_POISON),
    INSECT_REPELLENT_IMAGE("Insect Repellent", INSECT_REPELLENT),
    POISON_CHALICE_IMAGE("Poison Chalice", POISON_CHALICE),
    POISON_IMAGE("Poison", POISON),
    SULPHURIC_BROLINE_IMAGE("Sulphuric Broline", SULPHURIC_BROLINE),
    NITROGLYCERIN_IMAGE("Nitroglycerin", NITROGLYCERIN),
    MIXED_CHEMICALS_IMAGE("Mixed Chemicals", MIXED_CHEMICALS),
    CHEMICAL_COMPOUND_IMAGE("Chemical Compound", CHEMICAL_COMPOUND),
    NAPHTHA_MIX_IMAGE("Naphtha Mix", NAPHTHA_MIX),
    SERUM_IMAGE("Serum", SERUM_208_4),
    GYPSUM_IMAGE("Gypsum", GYPSUM),
    SODIUM_CHLORIDE_IMAGE("Sodium Chloride", SODIUM_CHLORIDE),
    NITROUS_OXIDE_IMAGE("Nitrous Oxide", NITROUS_OXIDE),
    VIAL_OF_LIQUID_IMAGE("Vial of Liquid", VIAL_OF_LIQUID),
    TIN_ORE_POWDER_IMAGE("Tin Ore Powder", TIN_ORE_POWDER),
    CUPRIC_ORE_POWDER_IMAGE("Cupric Ore Powder", CUPRIC_ORE_POWDER),
    MIXTURE_IMAGE("Mixture", _MIXTURE),
    TOXIC_NAPHTHA_IMAGE("Toxic Naphtha", TOXIC_NAPHTHA),
    JAR_OF_CHEMICALS_IMAGE("Jar of Chemicals", JAR_OF_CHEMICALS),
    BLUE_LIQUID_IMAGE("Blue Liquid", BLUE_LIQUID),
    CLEAR_LIQUID_IMAGE("Clear Liquid", CLEAR_LIQUID),

    // OTHER
    BUCKET_OF_WAX_IMAGE("Bucket of Wax", BUCKET_OF_WAX),
    OIL_CAN_IMAGE("Oil Can", OIL_CAN),
    BAILING_BUCKET_IMAGE("Bailing Bucket", BAILING_BUCKET_585),
    BLAMISH_SNAIL_SLIME_IMAGE("Blamish Snail Slime", BLAMISH_SNAIL_SLIME),
    BLAMISH_OIL_IMAGE("Blamish Oil", BLAMISH_OIL),
    BUCKET_OF_SAND_IMAGE("Bucket of Sand", BUCKET_OF_SAND),
    SILVER_POT_IMAGE("Silver Pot", SILVER_POT),
    PUNGENT_POT_IMAGE("Pungent Pot", PUNGENT_POT),
    GOLDEN_POT_IMAGE("Golden Pot", GOLDEN_POT),
    WASHING_BOWL_IMAGE("Washing Bowl", WASHING_BOWL),
    SACRED_OIL_IMAGE("Sacred Oil", SACRED_OIL4),
    FROZEN_BUCKET_IMAGE("Frozen Bucket", FROZEN_BUCKET),
    FROZEN_JUG_IMAGE("Frozen Jug", FROZEN_JUG),
    WAX_IMAGE("Wax", WAX),
    PUDDLE_OF_SLIME_IMAGE("Puddle of Slime", PUDDLE_OF_SLIME),
    BUCKET_OF_SLIME_IMAGE("Bucket of Slime", BUCKET_OF_SLIME),
    BLESSED_POT_IMAGE("Blessed Pot", BLESSED_POT_4667),
    SMOULDERING_POT_IMAGE("Smouldering Pot", SMOULDERING_POT),
    SLOP_OF_COMPROMISE_IMAGE("Slop of Compromise", SLOP_OF_COMPROMISE),
    BUCKET_OF_RUBBLE_IMAGE("Bucket of Rubble", BUCKET_OF_RUBBLE_7626),
    BONE_IN_VINEGAR_IMAGE("Bone in Vinegar", BONE_IN_VINEGAR_7816),
    BROKEN_CAULDRON_IMAGE("Broken Cauldron", BROKEN_CAULDRON),
    MAGIC_GLUE_IMAGE("Magic Glue", MAGIC_GLUE),
    WEIRD_GLOOP_IMAGE("Weird Gloop", WEIRD_GLOOP),
    BINDING_FLUID_IMAGE("Binding Fluid", BINDING_FLUID),
    JAR_OF_DIRT_IMAGE("Jar of Dirt", JAR_OF_DIRT),
    FROZEN_WHIP_MIX_IMAGE("Frozen Whip Mix", FROZEN_WHIP_MIX),
    VOLCANIC_WHIP_MIX_IMAGE("Volcanic Whip Mix", VOLCANIC_WHIP_MIX),
    HOLY_ELIXIR_IMAGE("Holy Elixir", HOLY_ELIXIR),
    JAR_OF_SAND_IMAGE("Jar of Sand", JAR_OF_SAND),
    JAR_OF_SOULS_IMAGE("Jar of Souls", JAR_OF_SOULS),
    JAR_OF_DARKNESS_IMAGE("Jar of Darkness", JAR_OF_DARKNESS),
    RESTORATION_POOL_IMAGE("Restoration Pool", RESTORATION_POOL),
    REVITALISATION_POOL_IMAGE("Revitalisation Pool", REVITALISATION_POOL),
    REJUVENATION_POOL_IMAGE("Rejuvenation Pool", REJUVENATION_POOL),
    FANCY_REJUVENATION_POOL_IMAGE("Fancy Rejuvenation Pool", FANCY_REJUVENATION_POOL),
    ORNATE_REJUVENATION_POOL_IMAGE("Ornate Rejuvenation Pool", ORNATE_REJUVENATION_POOL),
    JAR_OF_DECAY_IMAGE("Jar of Decay", JAR_OF_DECAY),
    VIAL_OF_BLOOD_IMAGE("Vial of Blood", VIAL_OF_BLOOD),
    GOAT_DUNG_IMAGE("Goat Dung", GOAT_DUNG),
    UNKNOWN_FLUID_ONE_IMAGE("Unknown Fluid 1", UNKNOWN_FLUID_1),
    UNKNOWN_FLUID_TWO_IMAGE("Unknown Fluid 2", UNKNOWN_FLUID_2),
    UNKNOWN_FLUID_THREE_IMAGE("Unknown Fluid 3", UNKNOWN_FLUID_3),
    UNKNOWN_FLUID_FOUR_IMAGE("Unknown Fluid 4", UNKNOWN_FLUID_4),
    UNKNOWN_FLUID_FIVE_IMAGE("Unknown Fluid 5", UNKNOWN_FLUID_5),
    BOTTOMLESS_COMPOST_BUCKET_IMAGE("Bottomless Compost Bucket", BOTTOMLESS_COMPOST_BUCKET),
    BOTTLED_DRAGONBREATH_IMAGE("Bottled Dragonbreath", BOTTLED_DRAGONBREATH),
    JAR_OF_DREAMS_IMAGE("Jar of Dreams", JAR_OF_DREAMS),
    JAR_OF_SPIRITS_IMAGE("Jar of Spirits", JAR_OF_SPIRITS),
    JAR_OF_SMOKE_IMAGE("Jar of Smoke", JAR_OF_SMOKE),
    SNOW_IMAGE("Snow", SNOW),
    LILY_OF_THE_ELID_IMAGE("Lily of the Elid", LILY_OF_THE_ELID);

    /**
     * Description of the image
     */
    private final String imageDescription;

    /**
     * ID of the image
     */
    private final int imageID;

    /**
     * <p>Get the description of the image
     * </p>
     * @return image description
     * @since 1.2.0
     */
    @Override
    public String toString()
    {
        return getImageDescription();
    }

    /**
     * <p>Get the ID of the image
     * </p>
     * @return image ID
     * @since 1.2.0
     */
    public int getID()
    {
        return getImageID();
    }
}
