package com.driver.bookMyShow.Services;

import com.driver.bookMyShow.Dtos.RequestDtos.UserEntryDto;
import com.driver.bookMyShow.Dtos.ResponseDtos.TicketResponseDto;
import com.driver.bookMyShow.Exceptions.UserAlreadyExistsWithEmail;
import com.driver.bookMyShow.Exceptions.UserDoesNotExists;
import com.driver.bookMyShow.Models.Ticket;
import com.driver.bookMyShow.Models.User;
import com.driver.bookMyShow.Repositories.UserRepository;
import com.driver.bookMyShow.Transformers.TicketTransformer;
import com.driver.bookMyShow.Transformers.UserTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public String addUser(UserEntryDto userEntryDto) throws UserAlreadyExistsWithEmail{
        if(userRepository.findByEmailId(userEntryDto.getEmailId()) != null) {
            throw new UserAlreadyExistsWithEmail();
        }
        User user = UserTransformer.userDtoToUser(userEntryDto);

        userRepository.save(user);
        return "User Saved Successfully";
    }

    public List<TicketResponseDto> allTickets(Integer userId) throws UserDoesNotExists{
        Optional<User> userOpt = userRepository.findById(userId);
        if(userOpt.isEmpty()) {
            throw new UserDoesNotExists();
        }
        User user = userOpt.get();
        List<Ticket> ticketList = user.getTicketList();
        List<TicketResponseDto> ticketResponseDtos = new ArrayList<>();
        for(Ticket ticket : ticketList) {
            TicketResponseDto ticketResponseDto = TicketTransformer.returnTicket(ticket.getShow(), ticket);
            ticketResponseDtos.add(ticketResponseDto);
        }
        return ticketResponseDtos;
    }
}
