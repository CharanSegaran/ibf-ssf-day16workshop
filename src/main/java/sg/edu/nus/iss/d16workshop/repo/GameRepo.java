package sg.edu.nus.iss.d16workshop.repo;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import sg.edu.nus.iss.d16workshop.model.Game;
import sg.edu.nus.iss.d16workshop.util.Util;

@Repository
public class GameRepo {
    
    @Autowired
    @Qualifier(Util.REDIS_TWO)
    // RedisTemplate template;
    HashOperations<String, String, Game> hashOps;

    public void test(){
        //HashOperations hashOps = template.opsForHash();

    }

    //CREATE (in Redis Map)
    public void saveGame(Game game) {
        hashOps.putIfAbsent(Util.KEY_GAMES, game.getGameId(), game);
    }

    //READ (from Redis Map)
    public Map<String, Game> getAllGames() {
        return hashOps.entries(Util.KEY_GAMES);
    }

    //READ one specific record (from Redis Map)
    public Game getGameByID(String gameID){
        return hashOps.get(Util.KEY_GAMES, gameID);
    }

    //UPDATE a specific record (in Redis Map)
    public void updateGame(Game game){
        hashOps.put(Util.KEY_GAMES, game.getGameId(), game);
    }

    //DELETE operations of a record (in Redis Map)
    public void deleteGame(Game game){
        hashOps.delete(Util.KEY_GAMES, game.getGameId());
    }
}
