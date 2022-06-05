import io.ktor.client.*
import io.ktor.client.engine.cio.*
import io.ktor.client.request.*
import io.ktor.client.statement.*
import net.torrow.api.client.TorrowApiClient
import net.torrow.api.models.TimetableFilter
import java.time.LocalDateTime

suspend fun main() {
    val token = "";

    val client = TorrowApiClient(token);

    val at = client.getServiceTimetable("", TimetableFilter(from = LocalDateTime.of(2022,1,1,1,1)), take = 10);

}