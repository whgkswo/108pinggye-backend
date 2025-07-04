package net.whgkswo.excuse_bundle.entities.posts.comments.dto;

import net.whgkswo.excuse_bundle.entities.members.core.dto.MemberResponseDto;
import net.whgkswo.excuse_bundle.entities.posts.comments.entity.CommentVoteDto;
import net.whgkswo.excuse_bundle.responses.dtos.Dto;

import java.time.LocalDateTime;

public record CommentResponseDto(
        boolean isReply,
        String content,
        MemberResponseDto member,
        int upvoteCount,
        int downvoteCount,
        CommentVoteDto myVote,
        LocalDateTime createdAt,
        LocalDateTime modifiedAt
) implements Dto {
}
