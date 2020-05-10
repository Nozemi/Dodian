package net.dodian.plugins.impl.dungeons.Icequeenlair;

import net.dodian.events.EventHandler;
import net.dodian.events.EventListener;
import net.dodian.events.impl.player.interact.object.PlayerObjectEvent;
import net.dodian.events.impl.player.interact.object.PlayerObjectFirstClickEvent;
import net.dodian.events.impl.player.interact.object.PlayerObjectSecondClickEvent;
import net.dodian.old.world.entity.impl.object.GameObject;
import net.dodian.old.world.entity.impl.player.Player;
import net.dodian.old.world.model.Position;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class IceQueenTunnels implements EventListener {

    private final GameObject IceQueenRockslide = new GameObject(2634, new Position(2838, 3517), "You need a mininglevel 50 to clear this rockslide!");

    private final GameObject IceQueenLadderA = new GameObject(16680, new Position(2845, 3516), "How do u get here without mininglevel 50?");
    private final GameObject IceQueenLadderB = new GameObject(16680, new Position(2848, 3519), "How do u get here without mininglevel 50?");
    private final GameObject IceQueenLadderC = new GameObject(16680, new Position(2848, 3513), "How do u get here without mininglevel 50?");
    private final GameObject IceQueenLadderD = new GameObject(16680, new Position(2824, 3507), "How do u get here without mininglevel 50?");
    private final GameObject IceQueenLadderE = new GameObject(16680, new Position(2827, 3510), "How do u get here without mininglevel 50?");
    private final GameObject IceQueenLadderF = new GameObject(16680, new Position(2823, 3513), "How do u get here without mininglevel 50?");
    private final GameObject IceQueenLadderG = new GameObject(16680, new Position(2857, 3517), "How do u get here without mininglevel 50?");
    private final GameObject IceQueenLadderH = new GameObject(16680, new Position(2859, 3519), "How do u get here without mininglevel 50?");

    private final GameObject IceQueenLadderAReturn = new GameObject(17385, new Position(2845, 9916), "How do u get here without mininglevel 50?");
    private final GameObject IceQueenLadderBReturn = new GameObject(17385, new Position(2848, 9913), "How do u get here without mininglevel 50?");
    private final GameObject IceQueenLadderCReturn = new GameObject(17385, new Position(2848, 9919), "How do u get here without mininglevel 50?");
    private final GameObject IceQueenLadderDReturn = new GameObject(17385, new Position(2824, 9907), "How do u get here without mininglevel 50?");
    private final GameObject IceQueenLadderEReturn = new GameObject(17385, new Position(2827, 9910), "How do u get here without mininglevel 50?");
    private final GameObject IceQueenLadderFReturn = new GameObject(17385, new Position(2823, 9913), "How do u get here without mininglevel 50?");
    private final GameObject IceQueenLadderGReturn = new GameObject(17385, new Position(2857, 9917), "How do u get here without mininglevel 50?");
    private final GameObject IceQueenLadderHReturn = new GameObject(17385, new Position(2859, 9919), "How do u get here without mininglevel 50?");
    private final GameObject IceQueenLadderIReturn = new GameObject(17385, new Position(2823, 9930), "How do u get here without mininglevel 50?");
    private final GameObject IceQueenLadderJReturn = new GameObject(17385, new Position(2845, 9925), "How do u get here without mininglevel 50?");



    private final GameObject[] objects = new GameObject[]{
            IceQueenRockslide,
            IceQueenLadderA,
            IceQueenLadderB,
            IceQueenLadderC,
            IceQueenLadderD,
            IceQueenLadderE,
            IceQueenLadderF,
            IceQueenLadderG,
            IceQueenLadderH,
            IceQueenLadderAReturn,
            IceQueenLadderBReturn,
            IceQueenLadderCReturn,
            IceQueenLadderDReturn,
            IceQueenLadderEReturn,
            IceQueenLadderFReturn,
            IceQueenLadderGReturn,
            IceQueenLadderHReturn,
            IceQueenLadderIReturn,
            IceQueenLadderJReturn

    };
    private boolean hasMiningLevel(Player player) {
        return player.getInventory().contains(1265);
    }


    public <T extends PlayerObjectEvent> void handleClick(T event) {
        if (!Arrays.asList(objects).contains(event.getObject())) {
            return;
        }

        if (!hasMiningLevel(event.getPlayer())) {
            Arrays.stream(objects)
                    .filter(object -> object.equals(event.getObject()))
                    .findFirst()
                    .ifPresent(object -> event.getPlayer().getPacketSender().sendMessage(object.getMessage()));
            return;
        }

        if (event.getObject().equals(IceQueenRockslide)) {
            event.getPlayer().moveTo(new Position(2840, 3516));
            return;
        }

        if (event.getObject().equals(IceQueenLadderA)) {
            event.getPlayer().moveTo(new Position(2844, 9916));
            return;
        }
        if (event.getObject().equals(IceQueenLadderB)) {
            event.getPlayer().moveTo(new Position(2847, 9919));
            return;
        }
        if (event.getObject().equals(IceQueenLadderC)) {
            event.getPlayer().moveTo(new Position(2847, 9913));
            return;
        }
        if (event.getObject().equals(IceQueenLadderD)) {
            event.getPlayer().moveTo(new Position(2823, 9907));
            return;
        }
        if (event.getObject().equals(IceQueenLadderE)) {
            event.getPlayer().moveTo(new Position(2826, 9910));
            return;
        }
        if (event.getObject().equals(IceQueenLadderF)) {
            event.getPlayer().moveTo(new Position(2823, 9912));
            return;
        }
        if (event.getObject().equals(IceQueenLadderG)) {
            event.getPlayer().moveTo(new Position(2858, 9917));
            return;
        }
        if (event.getObject().equals(IceQueenLadderH)) {
            event.getPlayer().moveTo(new Position(2860, 9919));
            return;
        }


        if (event.getObject().equals(IceQueenLadderAReturn)) {
            event.getPlayer().moveTo(new Position(2846, 3516));
            return;
        }
        if (event.getObject().equals(IceQueenLadderBReturn)) {
            event.getPlayer().moveTo(new Position(2849, 3513));
            return;
        }
        if (event.getObject().equals(IceQueenLadderCReturn)) {
            event.getPlayer().moveTo(new Position(2848, 3519));
            return;
        }
        if (event.getObject().equals(IceQueenLadderDReturn)) {
            event.getPlayer().moveTo(new Position(2825, 3507));
            return;
        }
        if (event.getObject().equals(IceQueenLadderEReturn)) {
            event.getPlayer().moveTo(new Position(2826, 3510));
            return;
        }
        if (event.getObject().equals(IceQueenLadderFReturn)) {
            event.getPlayer().moveTo(new Position(2822, 3513));
            return;
        }
        if (event.getObject().equals(IceQueenLadderGReturn)) {
            event.getPlayer().moveTo(new Position(2858, 3517));
            return;
        }
        if (event.getObject().equals(IceQueenLadderHReturn)) {
            event.getPlayer().moveTo(new Position(2860, 3519));
            return;
        }
        if (event.getObject().equals(IceQueenLadderIReturn)) {
            event.getPlayer().moveTo(new Position(2823, 3530));
            return;
        }
        if (event.getObject().equals(IceQueenLadderJReturn)) {
            event.getPlayer().moveTo(new Position(2845, 3525));
            return;
        }



    }

    @EventHandler
    public void onFirstClickObject(PlayerObjectFirstClickEvent event) {
        handleClick(event);
    }

    @EventHandler
    public void onSecondClickObject(PlayerObjectSecondClickEvent event) {
        handleClick(event);
    }
}
