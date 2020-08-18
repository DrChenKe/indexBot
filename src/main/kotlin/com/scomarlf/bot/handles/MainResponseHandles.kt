package com.scomarlf.bot.handles

import com.scomarlf.conf.Database
import com.scomarlf.generated.tables.Record.RECORD
import org.jooq.DSLContext
import org.jooq.Record
import org.jooq.Result
import org.jooq.SQLDialect
import org.jooq.impl.DSL
import org.telegram.abilitybots.api.sender.MessageSender
import org.telegram.telegrambots.meta.api.methods.send.SendMessage
import org.telegram.telegrambots.meta.api.objects.Update
import java.sql.DriverManager


class MainResponseHandles(sender: MessageSender?) {
    var sender: MessageSender? = null;

    init {
        this.sender = sender
    }

    fun helloWorld(update: Update) {
        val sendMsg = SendMessage()
        sendMsg.chatId = update.message.from.id.toString();
        sendMsg.text = "hello world";
        sender?.execute(sendMsg);
    }

    fun test() {
        try {
            val connection = DriverManager.getConnection(Database.URL, Database.USERNAME, Database.PASSWORD)
            val create: DSLContext = DSL.using(connection, SQLDialect.MYSQL)
            val result: Result<Record> = create.select().from(RECORD).fetch()

            println(result.size)


            create.close()
            connection.close()

        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

}