/*
 * Copyright (C) 2016 Bastian Oppermann
 * 
 * This file is part of Javacord.
 * 
 * Javacord is free software; you can redistribute it and/or modify
 * it under the terms of the GNU Lesser general Public License as
 * published by the Free Software Foundation; either version 3 of
 * the License, or (at your option) any later version.
 * 
 * Javacord is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this program; if not, see <http://www.gnu.org/licenses/>.
 */
package de.btobastian.javacord.listener.voicechannel;

import de.btobastian.javacord.DiscordAPI;
import de.btobastian.javacord.entities.VoiceChannel;
import de.btobastian.javacord.listener.Listener;

/**
 * This listener listens to voice channel position changes.
 */
public interface VoiceChannelChangePositionListener extends Listener {

    /**
     * This method is called every time a voice channel changed its position.
     *
     * @param api The api.
     * @param channel The voice channel with the updated position.
     * @param oldPosition The old position of the voice channel.
     */
    public void onVoiceChannelChangePosition(DiscordAPI api, VoiceChannel channel, int oldPosition);

}
