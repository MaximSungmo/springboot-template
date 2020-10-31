package com.example.demo.database.board;

import com.example.demo.database.user.Users;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import lombok.Data;
import org.apache.catalina.User;

@Entity
@Data
public class Board {

  @Id
  @GeneratedValue
  private Long id;
  private String title;
  private String content;
}