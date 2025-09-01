package fr.en0ri4n.craftcreator.recipes.base;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import fr.en0ri4n.craftcreator.utils.FormattableString;
import fr.en0ri4n.craftcreator.utils.JsonSerializable;

public abstract class ModifiedRecipe implements JsonSerializable
{
    protected static final Gson GSON = new GsonBuilder().setLenient().create();

    public abstract FormattableString getBaseLine();

    public abstract String toJson();
}
