package cn.nukkit.event.player;

import cn.nukkit.Player;
import cn.nukkit.event.Cancellable;
import cn.nukkit.event.HandlerList;
import cn.nukkit.item.Item;

/**
 * Called when a player starts eating food.
 * @author xRookieFight
 * @since 02/05/2026
 */
public class PlayerFoodEatEvent extends PlayerEvent implements Cancellable {
    private static final HandlerList handlers = new HandlerList();

    public static HandlerList getHandlers() {
        return handlers;
    }

    private final Item item;

    public PlayerFoodEatEvent(Player player, Item item) {
        this.player = player;
        this.item = item;
    }

    public Item getItem() {
        return this.item.clone();
    }
}
