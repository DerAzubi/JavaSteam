package in.dragonbra.javasteam.generated;

import in.dragonbra.javasteam.base.ISteamSerializableMessage;
import in.dragonbra.javasteam.enums.EClanRank;
import in.dragonbra.javasteam.enums.EClanRelationship;
import in.dragonbra.javasteam.enums.EMsg;
import in.dragonbra.javasteam.types.SteamID;

import java.io.InputStream;
import java.io.OutputStream;

public class MsgGSGetUserGroupStatusResponse implements ISteamSerializableMessage {

    private long steamIdUser = 0L;

    private long steamIdGroup = 0L;

    private EClanRelationship clanRelationship = EClanRelationship.from(0);

    private EClanRank clanRank = EClanRank.from(0);

    @Override
    public EMsg getEMsg() {
        return EMsg.GSGetUserGroupStatusResponse;
    }

    public SteamID getSteamIdUser() {
        return new SteamID(this.steamIdUser);
    }

    public void setSteamIdUser(SteamID steamId) {
        this.steamIdUser = steamId.convertToUInt64();
    }

    public SteamID getSteamIdGroup() {
        return new SteamID(this.steamIdGroup);
    }

    public void setSteamIdGroup(SteamID steamId) {
        this.steamIdGroup = steamId.convertToUInt64();
    }

    public EClanRelationship getClanRelationship() {
        return this.clanRelationship;
    }

    public void setClanRelationship(EClanRelationship clanRelationship) {
        this.clanRelationship = clanRelationship;
    }

    public EClanRank getClanRank() {
        return this.clanRank;
    }

    public void setClanRank(EClanRank clanRank) {
        this.clanRank = clanRank;
    }

    @Override
    public void serialize(OutputStream stream) {
    }

    @Override
    public void deserialize(InputStream stream) {
    }
}